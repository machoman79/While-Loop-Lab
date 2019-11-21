import java.util.Scanner;

public class GraduationTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int counter = 1;
        double total = 0.00;
        int count = 3;

        while (counter <= 12) {
            double grades = Double.parseDouble(scanner.nextLine());

            if (grades >= 4) {
                total += grades;
                ++counter;
            } else {
                if (count <= 2) {
                    System.out.printf("%s has been excluded at %d grade", name, --counter);
                    break;
                }
                --count;
                ++counter;
            }
            if (counter == 13) {
                System.out.printf("%s graduated. Average grade: %.2f", name, total / 12);
            }
        }
    }
}

