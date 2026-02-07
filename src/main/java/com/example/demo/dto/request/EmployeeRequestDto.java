package com.example.demo.dto.request;

import org.antlr.v4.runtime.misc.NotNull;

public class EmployeeRequestDto {

    @NotBlank(message = "Employee name is required")
    private String name;

    @Email (message = "Invalid email format")
    @NotBlank(message  = " Email is required")
    private String email;

    
    @NotNull(message ="salary is requried")
    @Positive(message = "salary is most be positive")
    private double salary;


}
