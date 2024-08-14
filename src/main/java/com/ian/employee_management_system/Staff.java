package com.ian.employee_management_system;



public class Staff extends Employee
{
    //constructor to initialize the name and salary of staff
    public Staff(String name, double salary)
    {
        super(name, salary);
    }
    
    
    // Implementation of performDuties() method for Staff role
    @Override
    public void performDuties() 
    {
        System.out.println("Staff " + getName() + " is performing general staff duties.");
    }
    
    
}
