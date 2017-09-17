package com.example.davidburnett.olympics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 17/09/2017.
 */
public class OlympicsTest {


    Olympics London2012;
    Team team1;
    Team team2;
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;

    @Before
    public void before(){


        team1 = new Team(Country.ENGLAND, EventName.RUNNING);
        athlete1 = new Athlete("Mo Farah", 100, Country.ENGLAND, EventName.RUNNING);
        athlete2 = new Athlete("Dwayne Chambers", 60, Country.ENGLAND, EventName.RUNNING);

        team2 = new Team(Country.SCOTLAND, EventName.RUNNING);
        athlete3 = new Athlete("Laura Muir", 90, Country.SCOTLAND, EventName.RUNNING);
        athlete4 = new Athlete("Eilish McColgan", 90, Country.SCOTLAND, EventName.RUNNING);

        team1.addParticipantToOlympicsRegistration();
        team2.addParticipantToOlympicsRegistration();

        London2012 = new Olympics();



    }

    @Test
    public void testAllParticipantsAreAdded(){
        assertEquals(2, London2012.getAllParticipants().size());
    }

    @Test
    public void testMedalCounter(){


        London2012.createMedalTable();
        assertEquals(2, London2012.getMedalTable().size());
    }



}