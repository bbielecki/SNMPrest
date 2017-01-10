package com.snmprest.entity.request;

/**
 * Created by Bartłomiej on 29.12.2016.
 */
public class AddUserRequest {

    String name;
    String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
