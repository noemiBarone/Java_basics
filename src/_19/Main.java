package _19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        List<Student> listStudent = new ArrayList<>();

        Student student1 = new Student("Noemi", "Berone", 63911, 20, "Atella");
        Student student2 = new Student("Luaca", "Rossi", 63008, 23, "Roma");

        listStudent.add(student1);
        listStudent.add(student2);

        student2.setName("Luca");
        student1.setSurname("Barone");
        student1.setAge(22);
        student2.setAge(24);
        student2.setPlaceOfProvenience("Tivoli");

        System.out.println(student1.getName() + " " +  student1.getSurname() + " ha " + student1.getAge() +
                " anni e viene da " + student1.getPlaceOfProvenience() + ". Numero di matricola: " +
                student1.getFreshman());

        System.out.println("\n" + student2.getName() + " " +  student2.getSurname() + " ha " + student2.getAge() +
                " anni e viene da " + student2.getPlaceOfProvenience() + ". Numero di matricola: " +
                student2.getFreshman());

    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        List<Student> listStudent = new ArrayList<>();

        Student student1 = new Student("Noemi", "Berone", 63911, 20, "Atella");
        Student student2 = new Student("Luaca", "Rossi", 63008, 23, "Roma");

        listStudent.add(student1);
        listStudent.add(student2);

        student2.setName("");
        student1.setSurname("");
        student1.setAge(2);
        student2.setAge(-4);
        student2.setPlaceOfProvenience("");

    }
}
