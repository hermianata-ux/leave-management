
package com.mycompany.leavemanagement.execption;


public class EmployeeNotFoundException extends RuntimeException 
{
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
