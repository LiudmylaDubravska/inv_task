package com.worldremit.recruitment.transfer.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class AccountOwner {
    private final String name;
    private final String surname;
    private final Date dateOfBirth;

    public AccountOwner(String name, String surname, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountOwner)) return false;
        AccountOwner that = (AccountOwner) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirth);
    }

    private String formatDatetoString(Date date){
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = sm.format(dateOfBirth);
             return strDate;
    }
    @Override
    public String toString() {

            return "AccountOwner(" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", dateOfBirth=" + formatDatetoString(dateOfBirth) +
                    ')';
    }
}
