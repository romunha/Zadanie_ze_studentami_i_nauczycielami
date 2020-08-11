package com.company;

abstract public class Person {
    protected String name;
    protected String surname;
    protected int age;
    public Person(String imie, String nazwisko, int wiek){
        name = imie;
        surname = nazwisko;
        age = wiek;
    }
    abstract String purposeOfGoingToUniwersity();

    abstract String wayOfSpendingHoliday();

    public void introuceYourself(){
        System.out.println("my name is " + name + " " + surname + " and my age is " + age);

    }
    public void tellMeSomethingAboutYou(){
        introuceYourself();
        System.out.println(wayOfSpendingHoliday());
        System.out.println(purposeOfGoingToUniwersity());



    }
}
