package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Welcome to Rock, Paper and Scissor game");
        System.out.print("Enter 1 to choose Rock, Enter 2 to choose Paper or Enter 3 to choose Scissor: ");
        byte user_choice = sc.nextByte();
        int computer_choice = rd.nextInt(1,4);
        if (user_choice==1 && computer_choice==3)
        {
            System.out.println("User choice: Rock");
            System.out.println("Computer choice: Scissor");
            System.out.println("Rock beats Scissor: You Win!");
        }
        else if (user_choice==1 && computer_choice==2)
        {
            System.out.println("User choice: Rock");
            System.out.println("Computer choice: Paper");
            System.out.println("Paper beats Rock: You Loose!");
        }
        else if (user_choice==2 && computer_choice==1)
        {
            System.out.println("User choice: Paper");
            System.out.println("Computer choice: Rock");
            System.out.println("Paper beats Rock: You Win!");
        }
        else if (user_choice==2 && computer_choice==3)
        {
            System.out.println("User choice: Paper");
            System.out.println("Computer choice: Scissor");
            System.out.println("Paper beats Scissor: You Win!");
        }
        else if (user_choice==3 && computer_choice==1)
        {
            System.out.println("User choice: Scissor");
            System.out.println("Computer choice: Rock");
            System.out.println("Rock beats Scissor: You Loose!");
        }
        else if (user_choice==3 && computer_choice==2)
        {
            System.out.println("User choice: Scissor");
            System.out.println("Computer choice: Paper");
            System.out.println("Scissor beats Paper: You Win!");
        }
        else
            switch (user_choice) {
                case 1 -> System.out.println("Both user and computer choice is Rock: Tie");
                case 2 -> System.out.println("Both user and computer choice is Paper: Tie");
                case 3 -> System.out.println("Both user and computer choice is Scissor: Tie");
            }
    }
}
