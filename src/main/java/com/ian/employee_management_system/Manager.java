package com.ian.employee_management_system;


public class Manager extends Employee
{
    //additional instance variable for manager
    private String department;  
    
    //constructor to initialize name, salary, and department
    public Manager(String name, double salary, String department)
    {
        super(name, salary);
        this.department = department;
    }
    
    //implementation of perform duties using method overriding 
    @Override
    public void performDuties()
    {
        System.out.println("Manager " + getName() + " is managing the " + department + " department.");
    }
}
