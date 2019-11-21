import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        while (!(num > 0 && num < 101)) {
            System.out.println("Invalid number!");
            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(("The number is: " + num));
    }
}