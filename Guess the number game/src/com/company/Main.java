package com.company;
import java.util.*;

class Game{
    int computer_num;
    int score;
    int range;

    Game(){
        Random rd = new Random();
        computer_num = rd.nextInt(1, 101);
    }
    public int noofGuesses(){
       return score++;
    }

    public void CheckRange(int rng){
        range = rng;
        if (range>computer_num){
            System.out.println("The number you guessed is more than the computer choice");
        }
        else {
            System.out.println("The number you guessed is less than the computer choice");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game playgame = new Game();
        int user_num = 0;
        while (user_num != playgame.computer_num) {
            System.out.print("Guess the Number: ");
            user_num = sc.nextInt();
            playgame.CheckRange(user_num);
            playgame.noofGuesses();
        }
        System.out.println("The Number is: "+user_num);
        System.out.println("Number of Guesses: "+playgame.score);

        }
    }

