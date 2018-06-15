package com.company;

import java.util.ArrayList;

public class SkillsArray {

        ArrayList<Skills> skill1;


        public SkillsArray (){
            skill1=new ArrayList<Skills>();
        }
        public void addSkill(Skills toAdd){
            this.skill1.add(toAdd);
        }

        @Override
        public String toString() {
            return " "+skill1 ;
        }
    }

