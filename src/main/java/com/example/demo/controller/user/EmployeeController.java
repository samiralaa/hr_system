package com.example.demo.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.EmployeeRequestDto;
import com.example.demo.dto.response.EmployeeResponseDto;
import com.example.demo.service.EmpolyeeService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("api/employee")
public class EmployeeController {
    private final EmpolyeeService service;
    public EmployeeController (EmpolyeeService service)
    {
        this.service = service;
    }

    @PostMapping()
    public EmployeeResponseDto create(@Valid @RequestBody EmployeeRequestDto dto)
    {
        return service.create(dto);
    }

    @GetMapping
    public List<EmployeeResponseDto> getAll() {
        return service.getAll();
    }
    
    
}

