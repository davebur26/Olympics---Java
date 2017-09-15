package com.example.davidburnett.olympics;

import android.icu.text.MessagePattern;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by davidburnett on 15/09/2017.
 */

public class Event {

    private ArrayList<Participant>entryList;
    private EventName name;
    private Participant goldWinner;
    private Participant silverWinner;
    private Participant bronzeWinner;


    public Event(EventName name){
        entryList = new ArrayList<>();
        this.name = name;
        goldWinner = null;
        silverWinner = null;
        bronzeWinner = null;

    }

    public ArrayList<Participant> getEntryList() {
        return entryList;
    }

    public EventName getName() {
        return name;
    }

    public Participant getGoldWinner() {
        return goldWinner;
    }

    public Participant getSilverWinner() {
        return silverWinner;
    }

    public Participant getBronzeWinner() {
        return bronzeWinner;
    }

    public void addAthletes(Participant participant){
        entryList.add(participant);
    }

    public void getWinner(){

        ArrayList<Integer>medalScores = new ArrayList<>();
        ArrayList<Participant>medalWinners = new ArrayList<>();
        medalScores.add(0);
        medalScores.add(0);
        medalScores.add(0);

        for(Participant participant: entryList){
            if (medalScores.get(0) < participant.getAbility()) {
                medalScores.add(0, participant.getAbility());
                medalWinners.add(0, participant);

            }else if (medalScores.get(1) < participant.getAbility()){
                medalScores.add(1, participant.getAbility());
                medalWinners.add(1, participant);

            }else if (medalScores.get(2) < participant.getAbility()){
                medalScores.add(2, participant.getAbility());
                medalWinners.add(2, participant);
            }
        }
        goldWinner = medalWinners.get(0);
        silverWinner = medalWinners.get(1);
        bronzeWinner = medalWinners.get(2);

        System.out.println(medalWinners.get(0).getGoldCount());
        System.out.println(medalWinners.get(1).getSilverCount());
        System.out.println(medalWinners.get(2).getBronzeCount());
        System.out.println(medalScores.get(0));
        System.out.println(medalScores.get(1));
        System.out.println(medalScores.get(2));

    }

    public void assignMedals(){
        goldWinner.setGoldCount();
        silverWinner.setSilverCount();
        bronzeWinner.setBronzeCount();

    }
}
