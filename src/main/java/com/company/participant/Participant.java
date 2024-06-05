package com.company.participant;

import com.company.martialArts.MartialArts;

public class Participant {
    private String firstName;
    private String lastName;
    private String phone;
    private MartialArts martialArts;

    public Participant(String firstName, String lastName, String phone, MartialArts martialArts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.martialArts = martialArts;
    }

    public void exercise() {
        martialArts.makeMove();
    }

    public String getProgress() {
        return martialArts.getReport();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
