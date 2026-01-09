package com.example.PetShop;

import java.util.Date;

public class Sad extends Mood {

    public Sad() {
        super();
    }

    public Sad(Date moodDate) {
        super(moodDate);
    }

    @Override
    public String returnMood() {
        return "Sad";
    }

}
