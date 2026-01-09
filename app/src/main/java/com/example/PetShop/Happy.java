package com.example.PetShop;

import java.util.Date;

public class Happy extends Mood {

    public Happy() {
        super();
    }

    public Happy(Date moodDate) {
        super(moodDate);
    }

    @Override
    public String returnMood() {
        return "Happy";
    }

}
