package com.example.davidburnett.olympics;

/**
 * Created by davidburnett on 15/09/2017.
 */

public class Athlete extends Participant {

    private String name;
    private int ability;


    public Athlete(String name, int ability, Country country, EventName eventEntered){
        super(country, eventEntered);
        this.name = name;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public int getAbility() {
        return ability;
    }
}
