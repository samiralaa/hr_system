package com.example.demo.controller.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.DepartmentRequestDto;
import com.example.demo.dto.response.DepartmentResponseDto;
import com.example.demo.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/department")
public class DepartmentController {
    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping()
    public DepartmentResponseDto create(@Valid @RequestBody DepartmentRequestDto dto) {
        return service.create(dto);
    }

    @GetMapping("/all")
    public List<DepartmentResponseDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public DepartmentResponseDto getById(@PathVariable Long id) {
        return service.getOne(id);
    }
}
