package com.company;

import java.util.ArrayList;

public class ExpArray {
    ArrayList<Experience> exp1;


    public ExpArray (){
        exp1= new ArrayList<>();
    }
    public void addExp(Experience toAdd){
        this.exp1.add(toAdd);
    }

    @Override
    public String toString() {
        String display ="";
        for(Experience s:exp1){
            display+= s+"\n";
        }
        return display;
    }
}