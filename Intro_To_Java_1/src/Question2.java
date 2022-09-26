import java.util.Scanner;

//Q2) Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline

public class Question2 {
    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder("");
        System.out.println("Please enter below: (type 'XDONE' to abort) ");
        Scanner input = new Scanner(System.in);
        while (true) {
            String line = input.nextLine();
            if ("XDONE".equals(line)) {
                break;
            }
            sb.append(line);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
