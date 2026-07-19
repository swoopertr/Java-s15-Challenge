package com.example.app.model;

public class MemberRecord {
    private long id;
    private String name;
    private String address;
    private String phoneNo;
    private String type;
    private String dateOfMembership;
    private int noBooksIssued;
    private int maxBookLimit;
    
    public MemberRecord(long id, String name, String address, String phoneNo, String type, String dateOfMembership, int noBooksIssued, int maxBookLimit) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.noBooksIssued = noBooksIssued;
        this.maxBookLimit = maxBookLimit;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
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