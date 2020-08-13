package com.company;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person implements LearningAndPassExams, FreeTime{
    private String fieldOfStudy;
    private int semester;
    final int AGELIMIT = 30;
    public Map<String,Integer> grades;
    private String StudentID;

    public Student(String imie, String nazwisko, int wiek, String kirunek, int semester, String index) {
        super(imie, nazwisko, wiek);
        fieldOfStudy = kirunek;
        this.semester = semester;
        StudentID = index;

        grades = new HashMap<String, Integer>();
        grades.put("wf", 2);
        grades.put("Niemiecki", 3);
        grades.put("religia", 4);
        grades.put("OC", 2);
        grades.put("wos", 4);

        if (age > AGELIMIT) {
            System.out.println("Student is too old!!!!");
            eligible = false;
        }
    }

    public String purposeOfGoingToUniwersity() {
        return "learning";
    }

    public String wayOfSpendingHoliday(){
        return "drinking lemonade";
}

    public void introduceYourself(){
        super.introuceYourself();
        int year = (semester +1) / 2;
        System.out.println("field of study is " + fieldOfStudy + " and im on " + semester + " semester, " + year + " year");

    }

    @Override
    public void learn(String subject) {
        System.out.println("Studen learn how to live" + subject);
    }

    @Override
    public void passExam(String subject) {
        grades.put(subject, 5);
        System.out.println("Student passed " + subject+ " exam");

    }

    @Override
    public void drink(String beer) {
        System.out.printf("Student drinks a lot of " + beer);
    }
}
