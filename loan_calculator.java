import java.util.Scanner;

public class loan_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        // your code goes here
        int month = 3;
        double principle = amount;

        while (month > 0) {
            double payment = 0.1 * principle;
            principle = principle - payment;
            month--;
        }

        int rem = (int) principle;

        System.out.println(rem);
    }
}