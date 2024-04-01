package com.ian.employee_management_system;

/**
 *
 * @author Ian Tagano
 */

public abstract class Employee 
{
    //private instance variables for employee
    private String name;
    private double salary;
    
    
    
    
    //constructor to initialize name and salary
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    
    
    //getter methods for retrieving name 
    public String getName()
    {
        return name;
    }
    
    //getter methods for retrieving salary
    public double getSalary()
    {
        return salary;
    }
    
    
    //abstract method for role specific behaviours
    public abstract void performDuties();
    
    
    
}
