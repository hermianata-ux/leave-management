
package com.mycompany.leavemanagement.repository;


import java.util.HashMap;
import java.util.Map;
import com.mycompany.leavemanagement.model.Employee;

public class EmployeeRepository {

    public Map<String, Employee> employeeMap = new HashMap<>();

    public void save(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
    }

    public Employee findById(String employeeId) {
        return employeeMap.get(employeeId);
    }
}
