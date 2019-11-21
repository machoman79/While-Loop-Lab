import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int fullPieces = 0;

        int areaCake = length * width;

        while (areaCake > fullPieces) {
            String pieces = scanner.nextLine();
            if ("STOP".equals(pieces)) {
                System.out.printf("%d pieces are left.", areaCake - fullPieces);
                break;
            }
            int piecesInt = Integer.parseInt(pieces);
            fullPieces += piecesInt;
        }
        if (areaCake <= fullPieces) {
            System.out.printf("No more cake left! You need %d pieces more.", fullPieces - areaCake);
        }
    }
}
