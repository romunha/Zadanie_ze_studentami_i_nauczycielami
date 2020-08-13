package com.company;

import java.util.Collection;

public class Teacher extends Person implements ExaminateStudents, Research {
    private String areaOfInterests;
    private String academicDegree;
    private double salary;
    public Teacher(String imie, String nazwisko, int wiek, String dziedzina, String stopien, double wyplata) {
        super(imie, nazwisko, wiek);
        areaOfInterests = dziedzina;
        academicDegree = stopien;
        salary = wyplata;

    }
    public String purposeOfGoingToUniwersity() {
        return "Teaching";
    }
    public String wayOfSpendingHoliday(){
        return "treatment of depression";
    }
        public void introduceYourself() {
        super.introuceYourself();
        System.out.println("academic degee is " + academicDegree + " and my area of interests is " + areaOfInterests);
    }
    public double annualBonus() {
       double yearBonus = salary * 12 / 10;
       return yearBonus;
    }

    @Override
    public void examinate(Collection<Student> students, String subject) {
        for (Student i : students) {
            if (i.grades.get(subject) == 5) {
                System.out.println(i.name + " zdawal juz egzamin");
            } else {
                System.out.println(i.name + " nie zdawal jeszcze egzaminu");
            }
        }
    }

        @Override
        public void doResearch () {

        }

        @Override
        public void writeAPublication (String title){

        }
    }
