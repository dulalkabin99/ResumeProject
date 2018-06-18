package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static int  counter=0;
    private static String name;
    private static String email;
    private static String degree;
    private static String college;
    private static int year;
    private static boolean go = true;
    private static String more;
    private static String company;
    private static String jobTitle;
    private static String fromDate;
    private static String todate;
    private static String jobDescription;
    private static String skills="";
    private static Resume res=new Resume();
    private static EducationArray edArray = new EducationArray();
    private static ExpArray expArray=new ExpArray();

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Resume Builder\n");
            System.out.println("Please Enter Your full name: ");
            name = sc.nextLine();
            System.out.println("Please enter your Email Address: ");
            email = sc.nextLine();
            res.info.setName(name);
            res.info.setEmail(email);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Educational Entries ");


        while (go == true && counter<=10) {
            System.out.println("Enter the college or organization of Achievement");
            college = sc.nextLine();

            System.out.println("Please Enter your Degree or Certification");
            degree = sc.nextLine();

            System.out.println("Please enter the year of achievement");
            year = sc.nextInt();
            sc.nextLine();

            Education thisEducation = new Education(college, degree, year);
            edArray.addEdu(thisEducation);
            counter++;

            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Your Educational Achievement have been saved");
            System.out.println("Do you have another Educational Achievement to add? Press Y/N");
            more = sc.nextLine();
            go = Continue(more);
        }


        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Do you have any Experiences to add? Y/N");
        more = sc.nextLine();
        go = Continue(more);
        counter=0;

        while (go&&counter<=10) {
            System.out.println("\nPlease Enter your company");
            company = sc.nextLine();
            System.out.println("Please Enter your JobTitle");
            jobTitle = sc.nextLine();
            System.out.println("From date format: MON YYYY");
            fromDate = sc.nextLine();
            System.out.println("To date, Format: MON YYYY");
            todate = sc.nextLine();
            go = true;
            jobDescription="";
            while (go) {
                System.out.println("Please enter a responsibility in this position");
                jobDescription += ("\n\t" + sc.nextLine());
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("Do you have another duty to add in this job? Y/N");
                more = sc.nextLine();
                go = Continue(more);

            }
            Experience thisExp = new Experience(jobTitle, company,fromDate,todate,jobDescription );
            expArray.addExp(thisExp);
            System.out.println("Your Experiences have been saved");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Do you have another Job Experience to add? Y/N");
            more = sc.nextLine();
            go = Continue(more);
        }


        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Now is the time to add some of your Skills");
        go=true;
        counter=0;
        while (go && counter<=20){ System.out.println("Please add your single Skill");

            skills += ("\n\t" + sc.nextLine());
            counter++;
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Do you have another skill? Y/N");
            more = sc.nextLine();
            go = Continue(more);
        }
        res.skill.setSkill(skills);



        System.out.println("Your Skills have been saved");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Thank you for your inputs, Your resume has been created");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");

        System.out.println(resPrint());
        System.out.println("-------------------------------------------------------");




    }

    private static String format1(EducationArray edArray) {
        String formattedString = edArray.toString()
                .replace("null", "")
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .trim();

        return formattedString;
    }



    private static Boolean Continue(String more) {
        if (more.equalsIgnoreCase("y")) {
            go = true;
        } else if (more.equalsIgnoreCase("n")) {
            go = false;
        } else System.out.println("invalid Entry");
        return go;
    }

    public static String format(ExpArray expArray){
        String formattedString = expArray.toString()
                .replace("null", "")
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .trim();

        return formattedString;
    }

    public static String resPrint(){
        String printResume="";
        printResume=(res.info.getName()+ "\n"+res.info.getEmail()+"\n\nEducation\n"+format1(edArray)+"\n\nExperiences\n"+format(expArray)+ "\n\nSkills"+res.skill.getSkill());
        return printResume;
    }
}

