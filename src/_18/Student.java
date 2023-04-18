package _18;

public class Student {
    private String name;
    private int age;

    public Student (String name, int age){
        System.out.println("Costructing...");
        this.name = name;
        System.out.println("Name: " + this.name);
        this.age = age;
        System.out.println("Age: " + this.age);
        System.out.println("Costructed!");
        System.out.println("\n");
    }

    public Student (String name){
        this.name = name;
    }

    public Student (int age){
        this.age = age;
    }

    public Student (){

    }
}
