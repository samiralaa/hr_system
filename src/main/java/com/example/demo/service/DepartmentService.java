package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.request.DepartmentRequestDto;
import com.example.demo.dto.response.DepartmentResponseDto;

public interface DepartmentService {
    DepartmentResponseDto create(DepartmentRequestDto dto);
    List<DepartmentResponseDto> getAll();
    DepartmentResponseDto getOne(Long id);
    DepartmentResponseDto update(Long id, DepartmentRequestDto dto);
    void delete(Long id);
}
