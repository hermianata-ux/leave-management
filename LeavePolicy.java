
package com.mycompany.leavemanagement.service;

import com.mycompany.leavemanagement.model.Employee;
import com.mycompany.leavemanagement.model.LeaveRequest;

public interface LeavePolicy {
    void validateLeave(Employee employee, LeaveRequest request);
}
