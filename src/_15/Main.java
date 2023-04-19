package _15;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        String mex = conversionCelsiusFahreneheit(30);
        System.out.println(mex);
    }

    private static String conversionCelsiusFahreneheit(double celsius){
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        return conversionDescription;
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0  ", "  Aziz");


        for (String name : names) {
            name = formattingString(name);
            System.out.println(name);
         }
    }

    private static String formattingString(String elem){
        boolean verify = isNumeric(elem); // alternativa a << elem.matches(".*[0:9].*") >>
        if(elem.matches(".*[0:9].*")){
            elem = "Invalid";
        } else {
            elem = elem.toUpperCase().trim();
        }
        return elem;
    }

    //alternativa a << elem.matches(".*[0:9].*") >>
    public static boolean isNumeric (String s){
        char[] caratteri = s.toCharArray();
        for (Character carattere : caratteri){
            if(Character.isDigit(carattere)){
                return true;
            }
        }
        return false;
    }



    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        printVariable(5.99, "Sandwich", "Nice big sandwich", 500);
    }

    public static void printVariable(double myLunchPrice, String lunchType, String description, int weightInGrams){
        System.out.println("Costo: " + myLunchPrice);
        System.out.println("Tipo: " + lunchType);
        System.out.println("Descrizione: " + description);
        System.out.println("Calorie: " + weightInGrams);
    }
}
