/*
Q3) Write a java program to show following menu to the user:

        *******Menu*******
        1. Calculate Area of Circle
        2. Calculate Circumference of a Circle
        3. Exit.
        Choose an option (1-3):

        Take radius as user input.

        Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
*/


import java.util.Scanner;

public class Question3 {

    public static double area(int radius){
        return Math.PI*radius*radius;
    }

    public static double circumference(int radius){
        return 2*Math.PI*radius;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println(
                        "*******Menu*******"+
                                "\n1. Calculate Area of Circle"+
                                "\n2. Calculate Circumference of a Circle"+
                                "\n3. Exit."+
                                "\nChoose an option (1-3):");

                int ch = sc.nextInt();
                switch (ch){
                    case 1: System.out.println("Enter radius : ");
                        int rad = sc.nextInt();
                        System.out.println("Area is : "+area(rad));
                        break;
                    case 2: System.out.println("Enter radius : ");
                        int rads = sc.nextInt();
                        System.out.println("Circumference is : "+circumference(rads));
                        break;
                    case 3: System.exit(0);

                    default: System.out.println("Not select right option!");
            }
        }
    }

}
