package com.example.davidburnett.olympics;

import java.util.ArrayList;

/**
 * Created by davidburnett on 16/09/2017.
 */

public class Olympics {

    private ArrayList<Participant>allParticipants;
    private ArrayList<Participant>medalTable;
    private ArrayList<Integer>medalCounter;

    public Olympics(){
        allParticipants = Participant.getAllParticipants();
        medalTable = new ArrayList<>();
        medalCounter = new ArrayList<>();

    }

    public ArrayList<Participant> getMedalTable() {
        return medalTable;
    }

    public ArrayList<Participant> getAllParticipants() {
        return allParticipants;
    }

//    This doesnt do country, only participant

    public void createMedalTable() {
        generateMedalArrays();
        for( int i = 0; i < medalCounter.size(); i++){
            for(Participant participant: allParticipants){
                if (!medalTable.contains(participant)) {

                    if (participant.getGoldCount() > medalCounter.get(i)) {
                        medalTable.set(i, participant);
                        medalCounter.set(i, participant.getGoldCount());


                    }else if(participant.getGoldCount() == medalTable.get(i).getGoldCount()) {
                        if (participant.getSilverCount() > medalTable.get(i).getSilverCount()) {
                            medalTable.set(i, participant);
                            medalCounter.set(i, participant.getGoldCount());


                        } else if (participant.getSilverCount() == medalTable.get(i).getSilverCount()) {
                            if (participant.getBronzeCount() >= medalTable.get(i).getBronzeCount()) {
                                medalTable.set(i, participant);
                                medalCounter.set(i, participant.getGoldCount());


                            } else if (medalTable.get(i).getCountry() == null) {
                                medalTable.set(i, participant);
                                medalCounter.set(i, participant.getGoldCount());

                            }
                        }
                    }

                }
            }
        }
    }

    public void generateMedalArrays(){
        Team fakeParticipant = new Team(null,null);
        int totalParticipants = getAllParticipants().size();
        for(int i = 0; i < totalParticipants; i++ ){
            medalCounter.add(0);
            medalTable.add(fakeParticipant);
        }
    }

//    create a country class which calculates all the medals london2012.getMedals(Gb) ???


}
