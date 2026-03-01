
package com.mycompany.leavemanagement.repository;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.leavemanagement.model.LeaveRequest;

public class LeaveRepository {

    public List<LeaveRequest> leaveRequests = new ArrayList<>();

    public void save(LeaveRequest request) {
        leaveRequests.add(request);
    }

    public List<LeaveRequest> findAll() {
        return leaveRequests;
    }
}
