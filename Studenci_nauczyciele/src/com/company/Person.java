package com.company;

abstract public class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected boolean eligible;
    public Person(String imie, String nazwisko, int wiek){
        name = imie;
        surname = nazwisko;
        age = wiek;
        eligible = true;
    }
    abstract String purposeOfGoingToUniwersity();

    abstract String wayOfSpendingHoliday();

    public void introuceYourself(){
        System.out.println("my name is " + name + " " + surname + " and my age is " + age);

    }
    public void tellMeSomethingAboutYou(){
        if(eligible != false){
            introuceYourself();
            System.out.println(wayOfSpendingHoliday());
            System.out.println(purposeOfGoingToUniwersity());
        }
    }
}
