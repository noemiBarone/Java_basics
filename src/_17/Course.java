package _17;

import java.util.*;

public class Course {
    String courseName;
    int maxStudents;
    String qualityRatingOutOf10;
    List<Student> studentList = new ArrayList<>();

    public void addStudent (Student student){
        studentList.add(student);
    }

    public void printList (){
        for (Student student : studentList){
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
        }
    }

    public double searchAverageAge (){
        int sum = 0;
        for (Student student : studentList){
            sum += student.age;
        }
        double media = Math.round(sum / studentList.size());
        return media;
    }


}
