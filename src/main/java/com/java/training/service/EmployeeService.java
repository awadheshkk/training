package com.java.training.service;

import com.java.training.entiry.EmployeeEntity;
import com.java.training.model.Employee;
import com.java.training.repository.EmployeeRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeService {

        @Autowired
        private EmployeeRespository repository;

        public List<EmployeeEntity> getAllEmployees() {
            return repository.findAll();
        }

        public EmployeeEntity getEmployeeById(Long id) {
            return repository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        }

        public EmployeeEntity saveEmployee(EmployeeEntity employee) {
            return repository.save(employee);
        }

        public EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeDetails) {
            EmployeeEntity employee = getEmployeeById(id);
            employee.setName(employeeDetails.getName());
            employee.setEmail(employeeDetails.getEmail());
            return repository.save(employee);
        }

        public void deleteEmployee(Long id) {
            repository.deleteById(id);
        }

}
