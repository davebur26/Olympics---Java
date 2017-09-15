package com.example.davidburnett.olympics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 15/09/2017.
 */
public class TeamTest {

    Team  team1;
    Athlete athlete1;
    Athlete athlete2;

    @Before
    public void before(){
        team1 = new Team(Country.ENGLAND, EventName.RUNNING);
        athlete1 = new Athlete("Mo Farah", 89, Country.ENGLAND, EventName.RUNNING);
        athlete2 = new Athlete("Dwayne Chambers", 45, Country.ENGLAND, EventName.RUNNING);
        team1.addAthletesToTeam(athlete1);
        team1.addAthletesToTeam(athlete2);
    }

    @Test
    public void testTeamDetails(){
        assertEquals(2, team1.getAthletes().size());
        team1.assignAbilityToTeam();
        assertEquals(67, team1.getAbility());
    }

    @Test
    public void testTeamNationalityEqualsAthletes(){
        assertEquals(Country.ENGLAND, team1.getCountry());
        assertSame(Country.ENGLAND, team1.getAthletes().get(0).getCountry());
    }

}