package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.example.demo.dto.request.DepartmentRequestDto;
import com.example.demo.dto.response.DepartmentResponseDto;
import com.example.demo.entity.department.Department;
import com.example.demo.repository.department.DepartmentRepository;
import com.example.demo.service.DepartmentService;
@Service
public class DepartmentServiceImpl  implements DepartmentService{
    private final DepartmentRepository repository;

    public DepartmentServiceImpl(DepartmentRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public DepartmentResponseDto create(DepartmentRequestDto dto)
    {
        Department department = new Department();
        department.setName(dto.getName());
        Department saved = repository.save(department);
        return mapToDto(saved);
    }

    @Override
    public List <DepartmentResponseDto> getAll()
    {
        return repository.findAll()
        .stream()
        .map(this::mapToDto)
        .collect(Collectors.toList());
    }
    @Override

    public DepartmentResponseDto getOne( Long id)
    {
        Department department = repository.findById(id)
        .orElseThrow(() ->new RuntimeException("Department not fund " + id));
        return mapToDto(department);
    }
    private DepartmentResponseDto mapToDto(Department department)
    {
        DepartmentResponseDto dto = new DepartmentResponseDto();
        dto.setId(department.getId());
        dto.setName(department.getName());
        return dto;
    }
    @Override
    public DepartmentResponseDto update(Long id, DepartmentRequestDto dto)
    {
        Department department = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Department not fund " +id));
        department.setName(dto.getName());
         repository.save(department);
        return mapToDto(department);
    }
    @Override
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Employee not found with id: " + id);
        }
        repository.deleteById(id);
    }
    
}
