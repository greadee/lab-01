package com.example.PetShop;

import java.util.Date;

public class Shrew extends Pet implements Pettable {
    public Shrew(String name) {
        super(name);
    }

    public Shrew(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "beep";
    }

    @Override
    public Void pet() {
    }
}
