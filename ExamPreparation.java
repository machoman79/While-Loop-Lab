import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int unsatisfGrades = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String taskName = "";
        String taskNameLast = "";
        int counterTasks = 0;
        double sumGrades = 0;
        int grades = 0;

        while (counter < unsatisfGrades) {
            taskName = scanner.nextLine();
            if ("Enough".equals(taskName)) {

                System.out.printf("Average score: %.2f%n", sumGrades / counterTasks);
                System.out.printf("Number of problems: %d%n", counterTasks);
                System.out.printf("Last problem: %s", taskNameLast);
                break;
            }
            grades = Integer.parseInt(scanner.nextLine());
            if (grades <= 4) {
                ++counter;
            }
            sumGrades += grades;
            ++counterTasks;
            taskNameLast = taskName;
        }
        if (counter == unsatisfGrades) {
            System.out.printf("You need a break, %d poor grades.", unsatisfGrades);
        }
    }
}
