package com.company;

import java.util.ArrayList;

public class EducationArray {
    ArrayList<Education> education1;


    public EducationArray (){
        education1=new ArrayList<Education>();
    }
    public void addEdu(Education toAdd){
        this.education1.add(toAdd);
    }

    @Override
    public String toString() {
        String display ="";{
            display=" "+education1;
        }
        return display;

    }
}