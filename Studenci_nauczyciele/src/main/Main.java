package main;

import com.company.Person;
import com.company.Student;
import com.company.Teacher;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Duszan", "Kasztelan", 233, "Duszpasterstwo", 7, "42");
        Teacher teacher = new Teacher("Bogdan", "Bulka", 12, "wychowanie w rodzinie", "mistrz", 2.50);
        student.introduceYourself();
        teacher.introduceYourself();
        System.out.println("Teacher has bonus " + teacher.annualBonus() + "zl!!!!!!!");

        Person[] array = new Person[10];

        array[0] = new Teacher("Renata", "Anonimowa", 123, "Biologia", "mistrz", 1.50);
        array[1] = new Teacher("Ireneusz", "Tajemniczy", 122, "wychowanie w sporcie", "mistrz", 1.50);
        array[2] = new Teacher("Janusz", "Bulka", 12, "wychowanie w rodzinie", "praktykant", 30000);
        array[3] = new Student("Teodor", "Dupa", 233, "Duszpasterstwo", 5, "32");
        array[4] = new Student("Halina", "Mastodont", 243, "Modelarstwo", 78, "22");
        array[5] = new Student("Grazyna", "Wrzod", 21, "Sklepikarstwo sredniowiecza", 6, "3");
        array[6] = new Student("Bernadetta", "Karmel", 22, "Milosc", 2, "487");
        array[7] = new Student("Faustyniusz", "Piszczel", 1, "WOS", 5, "64");
        array[8] = new Student("Krzeslaw", "Nowoprzysiegly", 27, "Krzywoprzysiestwo", 1,"4");
        array[9] = new Student("Jessica", "Gabryel", 1410, "Niewolnictwo", 32, "4");

        for (Person person : array) {
            person.tellMeSomethingAboutYou();
        }
        student.learn("matematyka w rodzinie");
        student.passExam("niemiecki jezyk");
        student.drink("kuflowe mocne");

        teacher.writeAPublication("Cokolwiek");
        teacher.doResearch();

        Student student1 = new Student("Duszan", "Kasztelan", 233, "Duszpasterstwo", 7, "42");
        Student student2 = new Student("Bogdan", "Kasztelan", 233, "Duszpasterstwo", 7, "42");
        Student student3 = new Student("Damina", "Kasztelan", 233, "Duszpasterstwo", 7, "42");
        Student student4 = new Student("Andrzej", "Kasztelan", 233, "Duszpasterstwo", 7, "42");
        student3.passExam("wf");
        student4.passExam("wf");

        Set <Student>studenciaki = new HashSet<>();
        studenciaki.add(student1);
        studenciaki.add(student2);
        studenciaki.add(student3);
        studenciaki.add(student4);

        teacher.examinate(studenciaki, "wf");

    }
}
