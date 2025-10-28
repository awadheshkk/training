package com.java.training.controller;

import com.java.training.entiry.EmployeeEntity;
import com.java.training.model.Employee;
import com.java.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @GetMapping(value="get-employee")
    public EmployeeEntity getEmployeeById(@RequestParam(name = "id") Long employeeId){

        return service.getEmployeeById(employeeId);
   }
        private final EmployeeService service;
        @Autowired
        public EmployeeController(EmployeeService service) {
            this.service = service;
        }

        @GetMapping
        public List<EmployeeEntity> getEmployees() {
            return service.getAllEmployees();
        }

        @GetMapping("/{id}")
        public EmployeeEntity getEmployee(@PathVariable Long id) {
            return service.getEmployeeById(id);
        }

        @PostMapping
        public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employee) {
            return service.saveEmployee(employee);
        }

        @PutMapping("/{id}")
        public EmployeeEntity updateEmployee(@PathVariable Long id, @RequestBody EmployeeEntity employee) {
            return service.updateEmployee(id, employee);
        }

        @DeleteMapping("/{id}")
        public String deleteEmployee(@PathVariable Long id) {
            service.deleteEmployee(id);
            return "Employee deleted successfully!";
        }



}
