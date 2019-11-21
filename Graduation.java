import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int counter = 1;
        double total = 0.00;

        while (counter <= 12) {
            double grades = Double.parseDouble(scanner.nextLine());
            if (grades >= 4.00) {
                total += grades;
                ++counter;
            }
        }
        double finale = total / 12.00;
        System.out.printf("%s graduated. Average grade: %.2f", name, finale);
    }
}
