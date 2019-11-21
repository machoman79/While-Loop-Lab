import java.util.Scanner;

public class OldBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int bookCount = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (counter < bookCount) {
            String bookSearched = scanner.nextLine();
            if (bookSearched.equals(bookName)) {
                System.out.println("You checked " + counter + " books and found it.");
                break;
            }
            ++counter;
        }
        if (counter == bookCount) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}
