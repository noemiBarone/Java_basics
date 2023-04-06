package esercizio3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int age = 22;
        System.out.println("Age: " + age);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char name = 'n';
        char surname = 'b';
        int age = 22;
        System.out.println("My age = " + age + ", my initial = " + name + "." + surname + ".");

    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        boolean hasEatenLunch = false; // Dichiarare e assegnare una variabile boolean
        double lunchCost = 5.99; // Dichiarare e assegnare una variabile double (decimale a 64 bit)

        System.out.println("Lunch cost=" + lunchCost); // Stampa: "Lunch cost=5.99"
        System.out.println("Has Eaten lunch=" + hasEatenLunch); // Stampa: "Has Eaten lunch=false"
    }

}
