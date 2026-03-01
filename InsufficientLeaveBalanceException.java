
package com.mycompany.leavemanagement.execption;


public class InsufficientLeaveBalanceException extends RuntimeException 
{
    public InsufficientLeaveBalanceException(String message) 
    {
        super(message);
    }
}
