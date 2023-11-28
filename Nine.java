import java.util.Scanner;

public class Nine {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);

                System.out.println("What is the X coordinate?");
                int x = myObj.nextInt();

                System.out.println("What is the Y Coordinate?");
                int y = myObj.nextInt();

                if (x > 0 && y > 0) {
                    System.out.println("You are in Quadrant 1");
                } else if (x < 0 && y > 0) {
                    System.out.println("You are in Quadrant 2");
                } else if (x < 0 && y < 0) {
                    System.out.println("You are in Quadrant 3");
                } else if (x > 0 && y < 0) {
                    System.out.println("You are in Quadrant 4");
                } else { // at least one of them must be zero
                    System.out.println("At least one of your x or y is on the axis");
                }

            }

    }
