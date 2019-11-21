import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        int number = Integer.MAX_VALUE;

        while (count >= counter) {
            int newNum = Integer.parseInt(scanner.nextLine());
            if (newNum < number)
                number = newNum;
            ++counter;
        }
        System.out.println(number);
    }
}
