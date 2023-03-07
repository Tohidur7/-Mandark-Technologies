
import java.util.Scanner;

public class ShortestDistanceOfManhattanPath {

    public static void main(String[] args) {

        int[] startingCoordinate = new int[2];
        System.out.println("enter starting coordinates: ");
        Scanner scanner = new Scanner(System.in);
        startingCoordinate[0] = scanner.nextInt();
        startingCoordinate[1] = scanner.nextInt();

        if (startingCoordinate[0] < 0 || startingCoordinate[0] >10) {
            System.out.println("invalid coordinate input");
            return;
        }
        if (startingCoordinate[1] < 0 || startingCoordinate[1] >10) {
            System.out.println("invalid coordinate input");
            return;
        }


        System.out.println("Enter a string for path");
        String pathString = scanner.next();

        if (!pathString.matches("^[EWSN]*$")) {
            System.out.println("invalid input");
            return;
        }

        System.out.println(shortestDistance(startingCoordinate, pathString));

    }

    private static double shortestDistance(int[] startingCoordinate, String pathString) {

        int x = startingCoordinate[0];
        int y = startingCoordinate[1];
        for (int i = 0; i < pathString.length(); i++) {

            if (pathString.charAt(i) == 'E') {
                x++ ;
            }else if (pathString.charAt(i) == 'W') {
                x-- ;
            }else if (pathString.charAt(i) == 'N') {
                y++ ;
            }if (pathString.charAt(i) == 'S') {
                y-- ;
            }
        }
        int x_displacement = x - startingCoordinate[0];
        if (x_displacement < 0) {
            x_displacement = -x_displacement ;
        }
        int y_displacement = y - startingCoordinate[1];
        if (y_displacement < 0) {
            y_displacement = -y_displacement ;
        }
        return Math.sqrt(x_displacement * x_displacement + y_displacement * y_displacement);

    }
}
