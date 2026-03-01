
package com.mycompany.leavemanagement.execption;


public class InvalidLeaveRequestException extends RuntimeException
{
    public InvalidLeaveRequestException(String message) 
    {
        super(message);
    }
}