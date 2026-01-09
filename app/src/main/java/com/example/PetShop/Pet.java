package com.example.PetShop;

import java.util.Date;

// 3.
public abstract class Pet {
    protected String name;
    protected Date birthDate;

    // 4a.
    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date();
    }

    // 4b.
    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // 6.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String speak();
}


