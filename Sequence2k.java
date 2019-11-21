import java.util.Scanner;

public class Sequence2k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int d = 1;

        while (d <= num) {
            System.out.println(d);
            d = d * 2 + 1;
        }
    }
}
