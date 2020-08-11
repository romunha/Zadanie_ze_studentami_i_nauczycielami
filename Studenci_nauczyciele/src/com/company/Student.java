package com.company;

public class Student extends Person {
    private String fieldOfStudy;
    private int semester;
    final int AGELIMIT = 30;

    public Student(String imie, String nazwisko, int wiek, String kirunek, int semester) {
        super(imie, nazwisko, wiek);
        fieldOfStudy = kirunek;
        this.semester = semester;
        if (age > AGELIMIT) {
            System.out.println("Student is too old!!!!");
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

}
