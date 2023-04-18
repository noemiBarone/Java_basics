package _16;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        long myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        myBankBalanceEuro += questionableFundsEuro;
        System.out.println("Account fondo monetario: " + myBankBalanceEuro);
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age --> short (la vita media di una persona è breve, non conviene usare tipi dal valore alto)
     *    2b: The age of a baby in months --> byte ( l'eta in mesi di un bimbo di solito si conta fino a circa 48 mesi)
     *    2c: Money in a hedgefund in euros --> double (potrebbero esserci anche centesimi, quindi è meglio usare un decimale)
     *    2d: Price of a good in euros on amazon.com --> float (i buoni sono spesso valori decimali ma non alti quanto un double)
     *    2e: The exact weight of an apple measured by scientific equipment --> int (si misura in interi)
     *    2f: The number of kilometers from any 2 places in the world --> long (essendo in km la distanza può essere molto alta)
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfYear());
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getMonthValue());

        LocalDate localDate1 = LocalDate.of(2022, Month.NOVEMBER, 11);
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.of(2023, Month.JANUARY, 10);
        System.out.println(localDate2);
        boolean verify = localDate1.isAfter(localDate2);
        boolean verify2 = localDate1.isBefore(localDate2);

        System.out.println(verify);
        System.out.println(verify2);
    }
}
