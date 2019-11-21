import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        change *= 100;
        int counter = 0;

        while (change >= 200) {
            change -= 200;
            counter++;
        }
        if (change >= 100) {
            change -= 100;
            counter++;
        }
        if (change >= 50) {
            change -= 50;
            counter++;
        }
        if (change >= 20) {
            change -= 20;
            counter++;
        }
        if (change >= 10) {
            change -= 10;
            counter++;
        }
        if (change >= 5) {
            change -= 5;
            counter++;
        }
        if (change >= 2) {
            change -= 2;
            counter++;
        }
        if (change >= 1) {
            counter++;
        }
        System.out.println(counter);
    }
}
