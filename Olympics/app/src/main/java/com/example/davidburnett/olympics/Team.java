package com.example.davidburnett.olympics;

import java.util.ArrayList;

/**
 * Created by davidburnett on 15/09/2017.
 */

public class Team extends Participant {

    private ArrayList<Athlete>athletes;
    private int ability;

    public Team(Country country, EventName eventEntered){
        super(country, eventEntered);
        athletes = new ArrayList<>();
        ability = 0;
    }


    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    public int getAbility() {
        return ability;
    }

    public void addAthletesToTeam(Athlete athlete){
        if ((athlete.getCountry().equals(this.getCountry())) && (athlete.getEnteredEvent().equals(this.getEnteredEvent()))) {
            athletes.add(athlete);
        }
    }


    public void assignAbilityToTeam(){
        int accumulatedAbilities = 0;

        for(int i = this.athletes.size() - 1; i >=0 ; i--){
            accumulatedAbilities += athletes.get(i).getAbility();
        }

        ability = accumulatedAbilities/athletes.size();
    }
}
