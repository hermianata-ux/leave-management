
package com.mycompany.leavemanagement.service;

import com.mycompany.leavemanagement.execption.InvalidLeaveRequestException;
import com.mycompany.leavemanagement.model.Employee;
import com.mycompany.leavemanagement.model.LeaveRequest;

public class EarnedLeavePolicy implements LeavePolicy {

    @Override
    public void validateLeave(Employee employee, LeaveRequest request) {
        if (request.getNumberOfDays() > 10) {
            throw new InvalidLeaveRequestException("Max 10 earned leaves at a time");
        }
    }
}
