
package com.mycompany.leavemanagement.service;

import com.mycompany.leavemanagement.execption.InvalidLeaveRequestException;
import com.mycompany.leavemanagement.model.Employee;
import com.mycompany.leavemanagement.model.LeaveRequest;

public class SickLeavePolicy implements LeavePolicy {

    @Override
    public void validateLeave(Employee employee, LeaveRequest request) {
        System.out.println(request.getNumberOfDays());
        if (request.getNumberOfDays() > 5) 
        {
            throw new InvalidLeaveRequestException("Max 5 consecutive sick leaves allowed");
        }
    }
}
