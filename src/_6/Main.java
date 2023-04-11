package _6;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Create a String to hold some text, decide on the text you want it to hold and then name it appropriately
     *
     *    print out your string in upper case, and in lower case
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        String famousSentence = "It’s elementary, my dear Watson.";
        System.out.println(famousSentence.toUpperCase());
        System.out.println(famousSentence.toLowerCase());
    }

    /**
     * 2: Edit the code below so it prints out the first name and last name in uppercase, and the middle name in lower case
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Change these
        String firstName = "Mario";
        String middleName = "Francesco";
        String lastName = "Rossi";

        System.out.println(firstName.toUpperCase() + " " + middleName.toLowerCase() + " " + lastName.toUpperCase()); // <--- Edit this line
    }


    /**
     * 3: Assign the value of 2 or more primitive types to our variable textFrom2Primitives
     *
     * Use the '+' operator
     *
     * choose from these primitives: double, int, char, boolean
     * use primitive literals like: 1.5, 67, 'b', true
     *
     * +
     *
     * Experiment with these different types, how do an int and a double behave when added?
     *
     * What about a boolean and an int?
     *
     * "" + 1.5
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        //double number = 10.22;

        boolean verify = true;
        int number2 = 2;
        char letter = 'b';
        // Quando si utilizza il + tra numeri, caratteri e booleani, questo non vine visto come una
        // concatenazione di stringhe ma come una somma, perciò il codice risulta scorretto.
        // Esempio:
        // String textFrom1Primitives = letter + number2;
        // String textFrom2Primitives = verify + number2;

        // Se dichiarassi e assegnassi i primitivi come stringhe, il + verrebbe letto corettamente come una
        // concatenazione. Esempio:
        String number3 = "5";
        String verify2 = "true";
        String textFrom2Primitives = number3 + verify2;

        // In alternativa è possibile aggiungere una stringa nella concatenazione. Esempio:
        String textFrom3Primitives = verify + " " +  number2;
        System.out.println(textFrom2Primitives);
        System.out.println(textFrom3Primitives);
    }


    /**
     * 4: Without editing the Strings below make the print statement print
     *
     *    1 2 3 4 5 6 7 8 9 with the correct spacing in between all the numbers
     *
     *    You will need to use .trim()
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String endNumbers = "7 8 9";
        String middleNumbers = "       4 5 6";
        String earlyNumbers = "1 2 3";

        System.out.println(earlyNumbers + " " +  middleNumbers.trim() + " " + endNumbers);
    }
}
