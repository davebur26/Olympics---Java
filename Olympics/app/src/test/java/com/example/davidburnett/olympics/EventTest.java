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
    Team team3;
    Team team4;
    Event run;
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;
    Athlete athlete5;
    Athlete athlete6;
    Athlete athlete7;
    Athlete athlete8;

    @Before
    public void before(){
        run = new Event(EventName.RUNNING, 6);
        team1 = new Team(Country.ENGLAND, EventName.RUNNING);
        athlete1 = new Athlete("Mo Farah", 100, Country.ENGLAND, EventName.RUNNING);
        athlete2 = new Athlete("Dwayne Chambers", 60, Country.ENGLAND, EventName.RUNNING);
        team1.addAthletesToTeam(athlete1);
        team1.addAthletesToTeam(athlete2);
        team1.assignAbilityToTeam();

        team2 = new Team(Country.SCOTLAND, EventName.RUNNING);
        athlete3 = new Athlete("Laura Muir", 90, Country.SCOTLAND, EventName.RUNNING);
        athlete4 = new Athlete("Eilish McColgan", 90, Country.SCOTLAND, EventName.RUNNING);
        team2.addAthletesToTeam(athlete3);
        team2.addAthletesToTeam(athlete4);
        team2.assignAbilityToTeam();

        team3 = new Team(Country.IRELAND, EventName.RUNNING);
        athlete5 = new Athlete("John Travers", 50, Country.IRELAND, EventName.RUNNING);
        athlete6 = new Athlete("Mark Christie", 50, Country.IRELAND, EventName.RUNNING);
        team3.addAthletesToTeam(athlete5);
        team3.addAthletesToTeam(athlete6);
        team3.assignAbilityToTeam();

        team4 = new Team(Country.WALES, EventName.RUNNING);
        athlete7 = new Athlete("Elinor Kirk", 30, Country.WALES, EventName.RUNNING);
        athlete8 = new Athlete("Sally Peake", 30, Country.WALES, EventName.RUNNING);
        team4.addAthletesToTeam(athlete7);
        team4.addAthletesToTeam(athlete8);
        team4.assignAbilityToTeam();

        run.addParticipants(team1);
        run.addParticipants(team2);
        run.addParticipants(team3);
        run.addParticipants(team4);


    }

    @Test
    public void eventDetails(){

        athlete1.addParticipantToOlympicsRegistration();
        athlete2.addParticipantToOlympicsRegistration();
        assertEquals(4, run.getEntryList().size());
        assertEquals(EventName.RUNNING, run.getName());
        assertEquals(2, Participant.getAllParticipants().size());
    }

    @Test
    public void checkEventCannotHaveTooManyParticipants(){
        run.addParticipants(athlete1);
        run.addParticipants(athlete2);
        run.addParticipants(athlete3);
        run.addParticipants(athlete4);
        run.addParticipants(athlete5);
        run.addParticipants(athlete6);
        run.addParticipants(athlete7);
        assertEquals(6, run.getMaxEntryLimit());

    }

    @Test
    public void testWinner(){
        run.getWinner();

        assertEquals(team2,run.getMedalWinner(Medal.GOLD));
        assertEquals(team1,run.getMedalWinner(Medal.SILVER));
        assertEquals(team3,run.getMedalWinner(Medal.BRONZE));

    }

}