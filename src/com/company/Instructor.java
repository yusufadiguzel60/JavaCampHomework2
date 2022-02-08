package com.company;

public class Instructor extends User {

    private String verdigiDers;

    public Instructor(int id, String firstName, String lastName, String userName, String password ,String verdigiDers) {
        super(id,firstName,lastName,userName,password);
        this.setVerdigiDers(verdigiDers);
    }

    public String getVerdigiDers() {
        return verdigiDers;
    }

    public void setVerdigiDers(String verdigiDers) {
        this.verdigiDers = verdigiDers;
    }
}
