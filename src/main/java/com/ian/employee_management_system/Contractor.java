package com.ian.employee_management_system;



public class Contractor extends Employee
{
    //private intances variable for constrctor 
    private String project;
    
    // Constructor to initialize name, salary, and project
    public Contractor(String name, double salary, String project) 
    {
        super(name, salary);
        this.project = project;
    }
    
    // Implementation of performDuties() method for Contractor role
    @Override
    public void performDuties() 
    {
        System.out.println("Contractor " + getName() + " is working on project: " + project);
    }
}
