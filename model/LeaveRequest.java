
package com.mycompany.leavemanagement.model;

import java.time.LocalDate;

public class LeaveRequest {

     public Employee employee;   
    public LeaveType leaveType;
    public int numberOfDays;
    public String reason;
    public LocalDate requestDate;
    public LeaveStatus status;

    public LeaveRequest(Employee employee,
                        LeaveType leaveType,
                        int numberOfDays,
                        String reason) 
    {
        this.employee = employee;
        this.leaveType = leaveType;
        this.numberOfDays = numberOfDays;
        this.reason = reason;
        this.requestDate = LocalDate.now();
        
       
    }

    public Employee getEmployee() { 
        return employee; 
    }
    public LeaveType getLeaveType() {
        return leaveType; 
    }
    public int getNumberOfDays() { 
        return this.numberOfDays; 
    }
    public String getReason() { 
        return reason;
    }
    public LeaveStatus getStatus() { 
        return status; 
    }

    public void setStatus(LeaveStatus status) {
        this.status = status;
    }
}
