package com.security.todo.management.service.impl;

import com.security.todo.management.dto.TodoDto;
import com.security.todo.management.entity.Todo;
import com.security.todo.management.repository.TodoRepository;
import com.security.todo.management.service.TodoService;
import exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    private ModelMapper modelMapper;

    @Override
    public TodoDto addTodo(TodoDto todoDto) {
        Todo todo = modelMapper.map(todoDto, Todo.class);
        return modelMapper.map(todoRepository.save(todo), TodoDto.class);
    }

    @Override
    public TodoDto getTodo(Long id) {
        Todo todo = checkIfIdExists(id); //Add custom exceptions : if id is not found, throw Resource Not Found Exception
        return modelMapper.map(todo, TodoDto.class);
    }

    @Override
    public List<TodoDto> getAllTodos() {
        return todoRepository.findAll()
                .stream().map(todo -> modelMapper.map(todo, TodoDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public TodoDto updateTodo(TodoDto todoDto, Long id) {
        Todo todo = checkIfIdExists(id);//Add custom exceptions : if id is not found, throw Resource Not Found Exception
        todo.setTitle(todoDto.getTitle());
        todo.setDescription(todoDto.getDescription());
        todo.setCompleted(todoDto.isCompleted());
        return modelMapper.map(todoRepository.save(todo), TodoDto.class);
    }

    @Override
    public void deleteTodo(Long id) {
        checkIfIdExists(id);
        todoRepository.deleteById(id);//Add custom exceptions : if id is not found, throw Resource Not Found Exception
    }

    @Override
    public TodoDto completeTodo(Long id) {

        Todo todo = checkIfIdExists(id);

        todo.setCompleted(true);

        Todo updatedTodo = todoRepository.save(todo);

        return modelMapper.map(updatedTodo, TodoDto.class);
    }

    @Override
    public TodoDto inCompleteTodo(Long id) {

        Todo todo = checkIfIdExists(id);

        todo.setCompleted(Boolean.FALSE);

        Todo updatedTodo = todoRepository.save(todo);

        return modelMapper.map(updatedTodo, TodoDto.class);
    }

    private Todo checkIfIdExists(Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id : " + id));// you can call from cache instead of repo
    }
}
