
package com.mycompany.leavemanagement.service;


import com.mycompany.leavemanagement.repository.EmployeeRepository;
import com.mycompany.leavemanagement.repository.LeaveRepository;
import com.mycompany.leavemanagement.model.LeaveStatus;
import com.mycompany.leavemanagement.model.LeaveRequest;
import com.mycompany.leavemanagement.model.Employee;
import com.mycompany.leavemanagement.execption.EmployeeNotFoundException;
import com.mycompany.leavemanagement.execption.InsufficientLeaveBalanceException;
import com.mycompany.leavemanagement.execption.InvalidLeaveRequestException;
import com.mycompany.leavemanagement.util.ValidationUtil;

public class LeaveService {

    public EmployeeRepository employeeRepo;
    public LeaveRepository leaveRepo;
    public LeavePolicy leavePolicy;  
    public EmployeeRepository empRepo;
public LeaveService() {}
    public LeaveService(EmployeeRepository employeeRepo,LeavePolicy policy, LeaveRepository leaveRepo) {
        this.employeeRepo = employeeRepo;
        this.leaveRepo = leaveRepo;
        this.leavePolicy = policy;
       
    }

    public void applyLeave(LeaveRequest request) {

        
        ValidationUtil.validateString(request.getReason());
        ValidationUtil.validatePositiveNumber(request.getNumberOfDays());
        ValidationUtil.validateEnum(request.getLeaveType());

        Employee employee = employeeRepo.findById(request.getEmployee().getEmployeeId());

        if (employee == null) {
            throw new EmployeeNotFoundException("Employee not found");
        }

        if (request.getNumberOfDays() > employee.getLeaveBalance()) {
            throw new InsufficientLeaveBalanceException("Insufficient balance");
        }

        if (employee.getTotalLeaveTakenThisYear() +
                request.getNumberOfDays()
                > employee.calculateMaxAllowedLeave()) {

            throw new InvalidLeaveRequestException("Exceeded yearly leave limit");
        }

        leavePolicy.validateLeave(employee, request);

        employee.deductLeave(request.getNumberOfDays());

        request.setStatus(LeaveStatus.APPROVED);

        leaveRepo.save(request);
    }
}
