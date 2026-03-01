
package com.mycompany.leavemanagement.model;


public  abstract class Employee {

    public  String employeeId;
    public  String name;
    protected int leaveBalance;
    protected int totalLeaveTakenThisYear;

    public Employee(String employeeId, String name, int leaveBalance) {
        this.employeeId = employeeId;
        this.name = name;
        this.leaveBalance = leaveBalance;
        this.totalLeaveTakenThisYear = 0;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public int getLeaveBalance() { return leaveBalance; }
    public int getTotalLeaveTakenThisYear() { return totalLeaveTakenThisYear; }

    public void deductLeave(int days) {
        this.leaveBalance -= days;
        this.totalLeaveTakenThisYear += days;
    }

    public abstract int calculateMaxAllowedLeave();
}
