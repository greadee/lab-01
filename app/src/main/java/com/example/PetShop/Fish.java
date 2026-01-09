package com.example.PetShop;

import java.util.Date;

public class Fish extends Pet{
    public Fish(String name) {
        super(name);
    }
    public Fish(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return ".o0 .o0 .o0";
    }
}
