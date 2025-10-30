package com.java.training.controller;

import com.java.training.entiry.EmployeeEntity;
import com.java.training.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private final EmployeeService service;
    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }


    @GetMapping(value="get-employee")
    public EmployeeEntity getEmployeeById(@RequestParam(name = "id") Long employeeId){

        return service.getEmployeeById(employeeId);
   }

    @PostMapping(value="get-employee")
    public EmployeeEntity getEmployeeById1(@RequestParam(name = "id") Long employeeId){

        return service.getEmployeeById(employeeId);
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
            if(log.isDebugEnabled()){
                log.debug(" if(log.isDebugEnabled()){)");
            }
            log.debug("debug log");
            log.info("info log");
            log.warn("warn log");
            log.trace("trace log");
        //    log.fetal("fetal log");
            log.error("error  log");
            return service.saveEmployee(employee);
        }

        @PutMapping("/{id}")
        public EmployeeEntity updateEmployee(@PathVariable Long id,@Validated @RequestBody EmployeeEntity employee) {
            return service.updateEmployee(id, employee);
        }

        @DeleteMapping("/{id}")
        public String deleteEmployee(@PathVariable Long id) {
            service.deleteEmployee(id);
            return "Employee deleted successfully!";
        }



}
