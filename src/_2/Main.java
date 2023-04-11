package _2;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.print("n.b. 'a'");
        System.out.println("");
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int age = 22;
        boolean yesLunch = true;
        boolean notLunch = false;
        double price = 9.99;
        System.out.println("Age: " + age);
        System.out.println("Pranzato? " + yesLunch);
        System.out.println("Price Lunch: " + price);
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        char name = 'n';
        char surname = 'b';
        char favouriteLetter = 'a';
        System.out.println(name + "." + surname + ".");
        System.out.println("My favourite letter = " + favouriteLetter);

    }
}
