package com.example.davidburnett.olympics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 15/09/2017.
 */
public class AthleteTest {

    Athlete athlete1;
    Athlete athlete2;

    @Before
    public void before(){
        athlete1 = new Athlete("Mo Farah", 89, Country.ENGLAND, EventName.RUNNING);
        athlete2 = new Athlete("Ross Murdoch", 78, Country.SCOTLAND, EventName.SWIMMING);
    }

    @Test
    public void getAthleteDetails(){
        assertEquals("Mo Farah", athlete1.getName());
        assertEquals(89, athlete1.getAbility());
        assertEquals(Country.ENGLAND, athlete1.getCountry());
        assertEquals(EventName.RUNNING, athlete1.getEnteredEvent());
        assertEquals(0, athlete1.getGoldCount());
        assertEquals(0, athlete1.getSilverCount());
        assertEquals(0, athlete1.getBronzeCount());
    }

}