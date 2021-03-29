import java.util.Scanner;

public class reversing_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        // your code goes here
        int x = arr.length;
        char[] arr2 = new char[x];
        for (char str : arr) {
            for (int i = (x - 1); i >= 0; i--) {
                arr2[i] = str;
            }
        }

        System.out.println(arr2);
    }
}
