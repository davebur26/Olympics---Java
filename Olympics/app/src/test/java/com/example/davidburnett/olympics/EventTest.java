package com.example.davidburnett.olympics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 15/09/2017.
 */
public class EventTest {

    Team team1;
    Team team2;
    Event run;
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;

    @Before
    public void before(){
        run = new Event(EventName.RUNNING);
        team1 = new Team(Country.ENGLAND, EventName.RUNNING);
        athlete1 = new Athlete("Mo Farah", 89, Country.ENGLAND, EventName.RUNNING);
        athlete2 = new Athlete("Dwayne Chambers", 45, Country.ENGLAND, EventName.RUNNING);
        team1.addAthletesToTeam(athlete1);
        team1.addAthletesToTeam(athlete2);
        team1.assignAbilityToTeam();
        team2 = new Team(Country.ENGLAND, EventName.RUNNING);
        athlete3 = new Athlete("Laura Muir", 96, Country.SCOTLAND, EventName.RUNNING);
        athlete4 = new Athlete("Eilish McColgan", 98, Country.SCOTLAND, EventName.RUNNING);
        team2.addAthletesToTeam(athlete1);
        team2.addAthletesToTeam(athlete2);
        team2.assignAbilityToTeam();
        run.addAthletes(team1);
        run.addAthletes(team2);
    }

    @Test
    public void eventDetails(){
        assertEquals(2, run.getEntryList().size());
        assertEquals(EventName.RUNNING, run.getName());

    }

}