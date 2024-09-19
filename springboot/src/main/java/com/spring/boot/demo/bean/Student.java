package com.spring.boot.demo.bean;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

//    @NonNull
    @Schema(description = "This is student's roll number : an Integer")
    private int rollNumber; //Unique

    @Schema(description = "This is student's full Name: a String")
    private String fullName;

    @Schema(description = "To know if student has some certifications : a Boolean")
    private Boolean isCertified;

}
