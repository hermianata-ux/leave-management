
package com.mycompany.leavemanagement.model;


public class PermanentEmployee extends Employee {

    public PermanentEmployee(String id, String name, int leaveBalance) {
        super(id, name, leaveBalance);
    }

    @Override
    public int calculateMaxAllowedLeave() {
        return 20;
    }
}
