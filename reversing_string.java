import java.util.Scanner;

public class reversing_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        // your code goes here
        int x = arr.length;
        char[] arr2 = new char[x];
        for (int i = 0; i < x; i++) {
            arr2[x-1] = arr[i];
            x -= 1;
        }

        System.out.println(arr2);
    }
}
