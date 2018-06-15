package com.company;

public class Resume {
    Info info;
    Education education;
    Experience experience;
    Skills skill;
    EducationArray educ;
    ExpArray exList;

    public  Resume(){
        this.info=new Info();
        this.education=new Education();
        this.experience=new Experience();
        this.skill=new Skills();
        this.educ=new EducationArray();
        this.exList=new ExpArray();

    }

    public EducationArray getEduc() {
        return educ;
    }

    public void setEduc(EducationArray educ) {
        this.educ = educ;
    }

    public ExpArray getExList() {
        return exList;
    }

    public void setExList(ExpArray exList) {
        this.exList = exList;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public Skills getSkill() {
        return skill;
    }

    public void setSkill(Skills skill) {
        this.skill = skill;
    }



    public String printResume(){
        String eduList =education.print();
        String expL=experience.print();
        String printResume="";
        printResume=(info.getName()+ "\n"+info.getEmail()+"\n\nEducation:\n"+eduList+"\n\nExperiences: "+expL+ "\n\nSkills"+skill.getSkill());
        return printResume;
    }
}
