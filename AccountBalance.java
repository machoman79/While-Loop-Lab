import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double countInstalments = Double.parseDouble(scanner.nextLine());
        int counter = 1;
        double total = 0.00;

        while (countInstalments >= counter) {

            double instalmentNew = Double.parseDouble(scanner.nextLine());
            if (instalmentNew >= 0) {
                System.out.printf("Increase: %.2f%n", instalmentNew);
                total += instalmentNew;
                ++counter;
            } else {
                System.out.println("Invalid operation!");
                break;
            }
        }
        System.out.printf("Total: %.2f", total);
    }
}
