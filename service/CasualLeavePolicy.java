
package com.mycompany.leavemanagement.service;


import com.mycompany.leavemanagement.execption.InvalidLeaveRequestException;
import com.mycompany.leavemanagement.model.Employee;
import com.mycompany.leavemanagement.model.LeaveRequest;

public class CasualLeavePolicy implements LeavePolicy {

    @Override
    public void validateLeave(Employee employee, LeaveRequest request) {
        if (request.getNumberOfDays() > 5) {
            throw new InvalidLeaveRequestException("Max 5 casual leaves at a time");
        }
    }
}

