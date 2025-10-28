package com.java.training.repository;

import com.java.training.entiry.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<EmployeeEntity, Long> {
}
