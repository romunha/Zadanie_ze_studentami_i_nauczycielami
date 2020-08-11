package com.company;

public class Teacher extends Person {
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
}
