package com.example.PetShop;

import java.util.Date;

public class Cat extends Pet implements Pettable{
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "meow"; // Cats meow
    }

    @Override
    public Void pet() {
    }
}
