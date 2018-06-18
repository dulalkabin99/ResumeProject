package com.company;

public class Experience {
    private String jobTitle;
    private String company;
    private String fromDate;
    private String toDate;
    private String jobDesc;
    ExpArray ex = new ExpArray();

    public Experience() {

    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public Experience(String jobT, String comp, String fromDat, String toDate, String jobD) {
        this.jobTitle = jobT;
        this.company = comp;
        this.fromDate = fromDat;
        this.toDate = toDate;
        this.jobDesc = jobD;


    }

    @Override
    public String toString() {
        String display = "";
        display = "\n"+jobTitle + ",\n" + company + ", " + fromDate+"-"+toDate + "\n"+jobDesc+"\n\n";
        return display;

    }
}
