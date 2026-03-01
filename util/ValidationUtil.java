
package com.mycompany.leavemanagement.util;



import com.mycompany.leavemanagement.execption.InvalidLeaveRequestException;

public class ValidationUtil {

    
    public static void validateString(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new InvalidLeaveRequestException("Reason cannot be blank");
        }
    }

    
    public static void validatePositiveNumber(int number) {
        if (number <= 0) {
            throw new InvalidLeaveRequestException(" Days must be greater than 0");
        }
    }

    
    public static void validateEnum(Object enumValue) {
        if (enumValue == null) {
            throw new InvalidLeaveRequestException("must be valid");
        }
    }

  
}
