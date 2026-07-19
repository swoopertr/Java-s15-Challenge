package com.example.app.model.Member.People;

import com.example.app.model.Member.MemberRecord;

public class Student extends MemberRecord {
    private Integer studentId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Student(Person person, long id, String address, String phoneNo, String type, String dateOfMembership, int noBooksIssued, int maxBookLimit, Integer studentId) {
        super(person, id, address, phoneNo, type, dateOfMembership, noBooksIssued, maxBookLimit);
        this.studentId = studentId;
    }
}
