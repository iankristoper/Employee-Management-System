package com.ian.employee_management_system;

/**
 *
 * @author Ian Tagano
 */

public class Employee_Management_System 
{

    public static void main(String[] args) 
    {
        Employee manager = new Manager("Ian", 500000, "Ian Company");
        Employee staff = new Staff("John Doe", 30000);
        Employee contractor = new Contractor("Elon musk", 59000, "Devin AI");
        
        
        System.out.println("Ian Company - Employee duties");
        manager.performDuties();
        staff.performDuties();
        contractor.performDuties();
        
        
                
    }
}
