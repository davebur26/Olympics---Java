package com.example.davidburnett.olympics;

/**
 * Created by davidburnett on 16/09/2017.
 */

public enum Medal {
    GOLD(0),
    SILVER(1),
    BRONZE(2);


    private int index;

    Medal(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}