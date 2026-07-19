package com.example.app.model.People;

import com.example.app.model.MemberRecord;

public class Student extends MemberRecord {
    private Integer studentId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Student(long id, String name, String address, String phoneNo,
                   String dateOfMembership, int noBooksIssued) {

        super(id, name, address, phoneNo, "Student", dateOfMembership,
              noBooksIssued, 3);
    }
}
