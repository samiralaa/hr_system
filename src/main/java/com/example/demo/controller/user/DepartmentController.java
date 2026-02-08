package com.example.demo.controller.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.DepartmentRequestDto;
import com.example.demo.dto.response.DepartmentResponseDto;
import com.example.demo.service.DepartmentService;
@RestController
@RequestMapping("api/department")
public class DepartmentController {
    private final DepartmentService service;
    public DepartmentController(DepartmentService service)
    {
        this.service = service;
    }
    @PostMapping()
    public DepartmentResponseDto create(DepartmentRequestDto dto )
    {
        return service.create(dto);
    }
}
