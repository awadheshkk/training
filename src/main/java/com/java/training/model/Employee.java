package com.java.training.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Employee {
    private Long id;
    private String name;
    private String email;
    private String phone;

}
