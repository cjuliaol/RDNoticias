package com.example.thewizard.cjuliaol.rdnoticias;

import java.util.Date;

/**
 * Created by cjuliaol on 13-Dec-15.
 */
public class Journalist {

    private int journalistId;
    private String name;
    private String lastName;
    private Date birthDate;
    private String sex;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getJournalistId() {
        return journalistId;
    }

    public void setJournalistId(int journalistId) {
        this.journalistId = journalistId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
