import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyExisted = Double.parseDouble(scanner.nextLine());
        int spendCounter = 0;
        int days = 0;

        while (spendCounter < 5) {
            String act = scanner.nextLine();
            double sumSpendOrSaved = Double.parseDouble(scanner.nextLine());

            if ("spend".equals(act)) {
                moneyExisted -= sumSpendOrSaved;
                if (moneyExisted < 0) {
                    moneyExisted = 0;
                }
                spendCounter++;
            }
            ++days;
            if ("save".equals(act)) {
                moneyExisted += sumSpendOrSaved;
                if (moneyExisted >= moneyNeeded) {
                    System.out.printf("You saved the money for %d days.", days);
                    break;
                }
                spendCounter = 0;
            }
        }
        if (spendCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
    }
}