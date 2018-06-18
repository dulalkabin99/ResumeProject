package com.company;

public class Education {
    private int year;
    private String collegeOrSchool;
    private String degreeOrCertificate;
    public Object educ;
    EducationArray eduAr =new EducationArray();

    public Education(String co, String de, int year){
        this.year=year;
        this.collegeOrSchool=co;
        this.degreeOrCertificate=de;
    }

    public Education() {

    }

    public int getYear() {
        return 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCollegeOrSchool() {
        return collegeOrSchool;
    }

    public void setCollegeOrSchool(String collegeOrSchool) {
        this.collegeOrSchool = collegeOrSchool;
    }

    public String getDegreeOrCertificate() {
        return degreeOrCertificate;
    }

    public void setDegreeOrCertificate(String degreeOrCertificate) {
        this.degreeOrCertificate = degreeOrCertificate;
    }
    @Override
    public String toString() {
        String display = "";
        display=degreeOrCertificate+ ",\n"+collegeOrSchool+", "+year+"\n\n";
        return display;
    }
}
