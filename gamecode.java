/*
Stone Paper Scissor
BY:- MANIK GUPTA
*/

import java.util.Random;
import java.util.Scanner;

class StonePaperScissor {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*         STONE PAPER SCISSOR        *");
        System.out.println("*                                    *");
        System.out.println("**************************************");
        System.out.println("* RULES : ENTER THE FOLLOWING NUMBER *");
        System.out.println("*              0 FOR STONE           *");
        System.out.println("*              1 FOR PAPER           *");
        System.out.println("*              2 FOR SCISSOR         *");
        System.out.println("**************************************");
        System.out.println(" ");
        System.out.print("Enter your choice: ");
        int a = sc.nextInt();
        Random r = new Random(); // For taking random number from computer
        int b = r.nextInt(3);

        if (a == b) {
            System.out.println("\nComputer chooses: " + b + " and you chooses: " + a);
            System.out.println("\n*** The game is DRAW ***");
        } else if ((a == 0 && b == 2) || (a == 1 && b == 0) || (a == 2 && b == 1)) {
            System.out.println("\nComputer chooses: " + b + " and you chooses: " + a);
            System.out.println("\n*** You WON the game ***");
        } else {
            System.out.println("\nComputer chooses: " + b + " and you chooses: " + a);
            System.out.println("\n*** You LOSE the game ***\n");
        }

        sc.close();
    }
}
