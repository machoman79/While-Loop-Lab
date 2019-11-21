import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int spaceTaken = 0;
        int volume = width * length * height;
        String boxes = "";

        while (spaceTaken <= volume) {
            boxes = scanner.nextLine();
            if ("Done".equals(boxes)) {
                System.out.println(volume - spaceTaken + " Cubic meters left.");
                break;
            }
            spaceTaken += Integer.parseInt(boxes);
        }
        if (!"Done".equals(boxes))
            System.out.printf("No more free space! You need %d Cubic meters more.", spaceTaken - volume);
    }
}
