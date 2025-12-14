import java.util.Scanner;

public class CircleOverlap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the radius of the first circle: ");
        double radius1 = in.nextDouble();
        double xcenter1 = 0;
        double ycenter1 = 0;

        System.out.print("Input the radius of the second circle: ");
        double radius2 = in.nextDouble();
        double xcenter2 = 40;
        double ycenter2 = 0;

        double distance = Math.sqrt(Math.pow(xcenter2 - xcenter1, 2) + Math.pow(ycenter2 - ycenter1, 2));

        if (distance < radius1 + radius2) {
            System.out.println("Circles are overlapping");
        } else {
            System.out.println("Circles are not overlapping");
        }
    }
}
