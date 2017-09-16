package com.example.davidburnett.olympics;

import android.icu.text.MessagePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by davidburnett on 15/09/2017.
 */

public class Event {

    private ArrayList<Participant>entryList;
    private ArrayList<Participant> medalWinners;
    private EventName name;
    private int maxEntryLimit;



    public Event(EventName name, int maxEntryLimit){
        entryList = new ArrayList<>();
        this.name = name;
        this.maxEntryLimit = maxEntryLimit;
        medalWinners = new ArrayList<>();

    }


    public ArrayList<Participant> getEntryList() {
        return entryList;
    }

    public EventName getName() {
        return name;
    }

    public int getMaxEntryLimit() {
        return maxEntryLimit;
    }

    public Participant getMedalWinner(Medal medal) {
        return medalWinners.get(medal.getIndex());
    }

    public void addParticipants(Participant participant) {
        if (entryList.size() < maxEntryLimit) {
            entryList.add(participant);
        }
    }

    public void assignMedals(){

        medalWinners.get(Medal.GOLD.getIndex()).setGoldCount();
        medalWinners.get(Medal.SILVER.getIndex()).setSilverCount();
        medalWinners.get(Medal.BRONZE.getIndex()).setBronzeCount();
    }

    public void resultProcessing(Medal medal){
        int medalScores = 0;

        for(Participant participant: entryList) {
            if ((medalScores < participant.getAbility()) && (!medalWinners.contains(participant))) {
                medalScores = (participant.getAbility());
                medalWinners.set(medal.getIndex(), participant);
            }
        }
    }


    public void getWinner(){

//      Is there a way without having to do this?
        medalWinners.add(null);
        medalWinners.add(null);
        medalWinners.add(null);

        resultProcessing(Medal.GOLD);
        resultProcessing(Medal.SILVER);
        resultProcessing(Medal.BRONZE);

        assignMedals();

    }






}
