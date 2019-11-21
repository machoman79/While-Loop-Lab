import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumSteps = 0;

        while (!(sumSteps >= 10000)) {
            String steps = scanner.nextLine();
            if ("Going home".equals(steps)) {
                int stepsIf = Integer.parseInt(scanner.nextLine());
                sumSteps += stepsIf;
                break;
            }
            int stepsInt = Integer.parseInt(steps);
            sumSteps += stepsInt;
        }
        if (sumSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - sumSteps);
        }
    }
}
