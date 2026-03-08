package com.example.demo.entity.attendance;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.example.demo.entity.employee.Employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="attendances")
public class Attendance {
    @CreationTimestamp
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "check_id" ,nullable =false)
    private LocalDateTime checkIn;

    @Column(name = "check_out" , nullable = false)
    private LocalDateTime checkOut;

    @ManyToOne
    @Column(name = "employee_id" , nullable = false)
    private Employee employee;

}
