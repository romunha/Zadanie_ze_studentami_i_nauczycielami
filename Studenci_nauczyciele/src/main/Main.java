package main;

import com.company.Person;
import com.company.Student;
import com.company.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Duszan", "Kasztelan", 233, "Duszpasterstwo", 7);
        Teacher teacher = new Teacher("Bogdan", "Bulka", 12, "wychowanie w rodzinie", "mistrz", 2.50);
        student.introduceYourself();
        teacher.introduceYourself();
        System.out.println("Teacher has bonus " + teacher.annualBonus() + "zl!!!!!!!");

        Person[] array = new Person[10];

        array[0] = new Teacher("Renata", "Anonimowa", 123, "Biologia", "mistrz", 1.50);
        array[1] = new Teacher("Ireneusz", "Tajemniczy", 122, "wychowanie w sporcie", "mistrz", 1.50);
        array[2] = new Teacher("Janusz", "Bulka", 12, "wychowanie w rodzinie", "praktykant", 30000);
        array[3] = new Student("Teodor", "Dupa", 233, "Duszpasterstwo", 5);
        array[4] = new Student("Halina", "Mastodont", 243, "Modelarstwo", 78);
        array[5] = new Student("Grazyna", "Wrzod", 21, "Sklepikarstwo sredniowiecza", 6);
        array[6] = new Student("Bernadetta", "Karmel", 22, "Milosc", 2);
        array[7] = new Student("Faustyniusz", "Piszczel", 1, "WOS", 5);
        array[8] = new Student("Krzeslaw", "Nowoprzysiegly", 27, "Krzywoprzysiestwo", 1);
        array[9] = new Student("Jessica", "Gabryel", 1410, "Niewolnictwo", 32);

        for (Person person : array) {
            person.tellMeSomethingAboutYou();
        }
    }
}
