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
        String display ="";{
            display=" "+exp1;
        }
        return display;
    }
}