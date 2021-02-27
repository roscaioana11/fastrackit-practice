package ro.fastrackit.classroom.exercises;

import java.util.Scanner;

public class NimGame {
    public static void main(String[] args) {
        int i = 10; //limita
        boolean Player = true;
        Scanner pick = new Scanner(System.in);
        System.out.println("There are " + i + " dots");
        while(true){
            if(Player == true){ //player 1 castiga in if, player 2 castiga in else
                System.out.println("Player 1 pick your number");
                int n = pick.nextInt();
                if(n >= 3 || n <= 0){ //conditie de wrong input
                    System.out.println("You can only pick 1 or 2.");
                }else{
                    i = i - n;
                    Player = false;
                    if(i <= 0){ //conditia daca player 1 castiga
                        System.out.println("Player 1 won");
                        break;
                    }
                }
            }else{
                System.out.println("Player 2 pick your number");
                int n = pick.nextInt();
                if(n == 1 || n == 2){ //conditie de right input
                    i = i - n;
                    Player = true;
                    if(i <= 0){ //conditia daca player 2 castiga
                        System.out.println("Player 2 won");
                        break;
                    }
                }else {
                    System.out.println("You can only pick 1 or 2.");
                }
            }
            System.out.println("There are " + i + " dots left");
        }
        System.out.println("Game Over");
    }
}
