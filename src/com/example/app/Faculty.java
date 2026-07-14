package com.example.app;

import java.util.List;

public class Faculty extends MemberRecord {
    List<Student> students;
    public Faculty(List<Student> students, long id, String name, String address, String phoneNo,
            String dateOfMembership, int noBooksIssued) {

        super(id, name, address, phoneNo, "Faculty", dateOfMembership,
                noBooksIssued, 10);
        this.students= students;
    }
}
