package com.security.todo.management.controller;

import com.security.todo.management.dto.LoginRequestDto;
import com.security.todo.management.dto.TodoDto;
import com.security.todo.management.security.JWTUtil;
import com.security.todo.management.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/todos")
public class TodoController {

    private TodoService todoService;

    private AuthenticationManager authenticationManager;

    private JWTUtil jwtUtil;

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDto requestDto){
        UsernamePasswordAuthenticationToken  token = new UsernamePasswordAuthenticationToken(
                requestDto.getUsername(),
                requestDto.getPassword()
        );

        authenticationManager.authenticate(token);

        String jwt = jwtUtil.generate(requestDto.getUsername());

        return ResponseEntity.ok(jwt);
    }

    @PostMapping
    @PreAuthorize("hasRole(\"ADMIN\")")
//    @PostAuthorize()
    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto) {
        TodoDto savedTodo = todoService.addTodo(todoDto);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    @GetMapping
    @PreAuthorize("hasAnyRole(\"ADMIN\", \"USER\")")
    public ResponseEntity<List<TodoDto>> getAllTodos() {
        List<TodoDto> todoDtos = todoService.getAllTodos();
        return new ResponseEntity<>(todoDtos, HttpStatus.OK);
    }

    @PutMapping("{id}")
    @PreAuthorize("hasAnyRole(\"ADMIN\", \"USER\")")
    public ResponseEntity<TodoDto> updateTodo(@RequestBody TodoDto todoDto, @PathVariable("id") Long todoId){
        TodoDto updatedTodo = todoService.updateTodo(todoDto, todoId);
        return ResponseEntity.ok(updatedTodo);
    }

    @DeleteMapping("{id}")
    @PreAuthorize("hasAnyRole(\"ADMIN\", \"USER\")")
    public ResponseEntity<String> deleteTodo(@PathVariable("id") Long todoId){
        todoService.deleteTodo(todoId);
        return ResponseEntity.ok("Todo Task deleted successfully!.");
    }


    @PatchMapping("{id}/complete")
    @PreAuthorize("hasAnyRole(\"ADMIN\", \"USER\")")
    public ResponseEntity<TodoDto> completeTodo(@PathVariable("id") Long todoId){
        TodoDto updatedTodo = todoService.completeTodo(todoId);
        return ResponseEntity.ok(updatedTodo);
    }

    @PatchMapping("{id}/in-complete")
    public ResponseEntity<TodoDto> inCompleteTodo(@PathVariable("id") Long todoId){
        TodoDto updatedTodo = todoService.inCompleteTodo(todoId);
        return ResponseEntity.ok(updatedTodo);
    }
}
