package com.example.app.model.Member;

import com.example.app.model.Member.People.Person;

public class MemberRecord {
    private long id;

    private String address;
    private String phoneNo;
    private String type;
    private String dateOfMembership;
    private int noBooksIssued;
    private int maxBookLimit;
    private Person person;
    
    public MemberRecord(Person person,long id, String address, String phoneNo, String type, String dateOfMembership, int noBooksIssued, int maxBookLimit) {
        this.id = id;
        this.address = address;
        this.phoneNo = phoneNo;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.noBooksIssued = noBooksIssued;
        this.maxBookLimit = maxBookLimit;
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return person.getName();
    }

    public Integer getTcNo() {
        return person.getTcNo();
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getType() {
        return type;
    }

    public String getDateOfMembership() {
        return dateOfMembership;
    }

    public int noBooksIssued() {
        return noBooksIssued;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public MemberRecord getMemberRecord() { //???
        return this;
    }

    public void incBookIssued() {
        if (noBooksIssued < maxBookLimit) {
            noBooksIssued++;
        } else {
            System.out.println("Kitap limiti aşıldı..");
        }
    }

    public void decBookIssued() {
        if (noBooksIssued > 0) {
            noBooksIssued--;
        } else {
            System.out.println("İade edilecek kitap yok..");
        }
    }

    public void payBill() {
        //
    }
}