package com.example.PetShop;

import java.util.Date;

public class Snake extends Pet{
    public Snake(String name) {
        super(name);
    }

    public Snake(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "Colonel, this Metal Gear is Solid!";
    }
}
