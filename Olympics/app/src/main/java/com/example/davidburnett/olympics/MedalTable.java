package com.example.davidburnett.olympics;

import java.util.ArrayList;

/**
 * Created by davidburnett on 16/09/2017.
 */

public class MedalTable {

    private ArrayList<Event>allEvents;
    private ArrayList<Participant>medalTable;

    public MedalTable(){
        allEvents = new ArrayList<>();
        medalTable = new ArrayList<>();
    }

    public ArrayList<Event> getAllEvents() {
        return allEvents;
    }

    public ArrayList<Participant> getMedalTable() {
        return medalTable;
    }


}
