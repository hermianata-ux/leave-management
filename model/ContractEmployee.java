
package com.mycompany.leavemanagement.model;

public class ContractEmployee extends Employee {

    public ContractEmployee(String id, String name, int leaveBalance) {
        super(id, name, leaveBalance);
    }

    @Override
    public int calculateMaxAllowedLeave() {
        return 10;
    }
}
