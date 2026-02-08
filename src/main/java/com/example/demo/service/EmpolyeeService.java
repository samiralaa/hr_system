package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.request.EmployeeRequestDto;
import com.example.demo.dto.response.EmployeeResponseDto;

public interface EmpolyeeService {
    EmployeeResponseDto create(EmployeeRequestDto dto);
    List<EmployeeResponseDto> getAll();
   EmployeeResponseDto getOneUser(Long id);
   EmployeeResponseDto update(Long id, EmployeeRequestDto dto);
   void delete(Long id);
}
