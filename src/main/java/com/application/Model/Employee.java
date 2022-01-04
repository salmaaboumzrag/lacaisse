package com.application.Model;


import java.util.Date;

/**
 * @author : dihamza
 * Employee is an abstarct class used to be iherited by Manager and Waiter classes and its describe
 * commun properties and behaviors of the manager and waiter.
 */

abstract public class Employee {
    //attributes
    private int id;
    private String role;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private float salary;
    private String password;
    private int createdBy;
    private Date createdAt;
    private int updatedBy;
    private Date updatedAt;

    //constructor

    public Employee(int id, String role, String userName, String firstName, String lastName, String email, float salary, String password, int createdBy, Date createdAt, int updatedBy, Date updatedAt) {
        this.id = id;
        this.role = role;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.password = password;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }


    //getters
    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public float getSalary() {
        return salary;
    }

    public String getPassword() {
        return password;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
