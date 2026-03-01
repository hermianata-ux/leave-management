
package com.mycompany.leavemanagement;

import com.mycompany.leavemanagement.service.LeavePolicy;
import com.mycompany.leavemanagement.service.LeaveService;
import com.mycompany.leavemanagement.service.SickLeavePolicy;
import com.mycompany.leavemanagement.repository.EmployeeRepository;
import com.mycompany.leavemanagement.repository.LeaveRepository;
import com.mycompany.leavemanagement.model.LeaveRequest;
import com.mycompany.leavemanagement.model.Employee;
import com.mycompany.leavemanagement.model.LeaveType;
import com.mycompany.leavemanagement.model.PermanentEmployee;


public class LeaveManagement {

    public static void main(String[] args) {

        EmployeeRepository empRepo = new EmployeeRepository();
        LeaveRepository leaveRepo = new LeaveRepository();

        Employee emp = new PermanentEmployee("E101", "John", 10);
        empRepo.save(emp);

        LeavePolicy policy = new SickLeavePolicy();
         
        LeaveService service = new LeaveService(empRepo,policy,leaveRepo);
        
        LeaveRequest request = new LeaveRequest(emp, LeaveType.SICK, 3, "fever");
        
     
        try {
            service.applyLeave(request);
            System.out.println("Status: " + request.getStatus());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}