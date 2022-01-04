package com.application.Model;

import java.util.Date;

public class Manager extends Employee{

    public Manager(int id, String role, String userName, String firstName, String lastName, String email, float salary, String password, int createdBy, Date createdAt, int updatedBy, Date updatedAt) {
        super(id, role, userName, firstName, lastName, email, salary, password, createdBy, createdAt, updatedBy, updatedAt);
    }
}
