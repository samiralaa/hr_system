package com.example.demo.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class DepartmentRequestDto {
    
   
    @NotEmpty
    @Size(max =50, message ="name must be large 60")
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
