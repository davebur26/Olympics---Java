package com.example.davidburnett.olympics;

import java.util.ArrayList;

/**
 * Created by davidburnett on 15/09/2017.
 */


public abstract class Participant {

    private Country country;
    private EventName enteredEvent;
    private int goldCount;
    private int silverCount;
    private int bronzeCount;
    private static ArrayList<Participant>allParticipants;

    public Participant(Country country, EventName enteredEvent){
        this.country = country;
        this.enteredEvent = enteredEvent;
        goldCount = 0;
        silverCount = 0;
        bronzeCount = 0;
        allParticipants = new ArrayList<>();



    }



    public Country getCountry() {
        return country;
    }

    public EventName getEnteredEvent() {
        return enteredEvent;
    }

    public int getGoldCount() {
        return goldCount;
    }

    public int getSilverCount() {
        return silverCount;
    }

    public int getBronzeCount() {
        return bronzeCount;
    }

    public static ArrayList<Participant> getAllParticipants() {
        return allParticipants;
    }

    public void setGoldCount() {
        this.goldCount ++;
    }

    public void setSilverCount() {
        this.silverCount ++;
    }

    public void setBronzeCount() {
        this.bronzeCount ++;
    }

    public abstract int getAbility();

    public void addParticipantToOlympicsRegistration(){
        allParticipants.add(this);

    }

}
