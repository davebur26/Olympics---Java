package com.example.davidburnett.olympics;

import java.util.ArrayList;

/**
 * Created by davidburnett on 15/09/2017.
 */

public class Event {

    private ArrayList<Participant>entryList;
    private EventName name;

    public Event(EventName name){
        entryList = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Participant> getEntryList() {
        return entryList;
    }

    public EventName getName() {
        return name;
    }

    public void addAthletes(Participant participant){
        entryList.add(participant);
    }

    public void getWinner(){
        Participant currentGold = null;
        Participant currentSilver = null;
        Participant currentBronze = null;
        int currentWinningScore = 0;

        for(Participant participant: entryList){
            if (currentWinningScore < participant.getAbility()) {
                currentWinningScore = participant.getAbility();
                currentBronze = currentSilver;
                currentSilver = currentGold;
                currentGold = participant;
            }
        }

        currentGold.setGoldCount();
        currentSilver.setSilverCount();
        currentBronze.setBronzeCount();
    }
}
