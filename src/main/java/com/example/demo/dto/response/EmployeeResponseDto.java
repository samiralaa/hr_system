package com.example.demo.dto.response;

public class EmployeeResponseDto {
    private Long id;
    private String name;
    private String email;
    private double salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

      public double getSalary() {
        return salary;
    }

    public void setSalary(double salay) {
        this.salary = salary;
    }


}
