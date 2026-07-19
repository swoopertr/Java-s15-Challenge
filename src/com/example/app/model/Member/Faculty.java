package com.example.app.model.Member;

import com.example.app.model.Member.People.Person;
import com.example.app.model.Member.People.Student;

import java.util.List;

public class Faculty extends MemberRecord {
    List<Student> students;

    public Faculty(Person person, long id, String address, String phoneNo, String type, String dateOfMembership, int noBooksIssued, int maxBookLimit, List<Student> students) {
        super(person, id, address, phoneNo, type, dateOfMembership, noBooksIssued, maxBookLimit);
        this.students = students;
    }
}
