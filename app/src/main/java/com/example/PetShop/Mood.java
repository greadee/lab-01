package com.example.PetShop;

import java.util.Date;

public abstract class Mood {

    protected Date moodDate;

    // constructor
    public Mood() {
        this.moodDate = new Date();
    }

    public Mood(Date moodDate) {
        this.moodDate = moodDate;
    }

    // getter and setter
    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }

    public Date getMoodDate() {
        return moodDate;
    }

    public abstract String returnMood();

}
