/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author 17202
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many rounds do you want to play? (1-10) ");
        int rounds = Integer.parseInt(input.nextLine());
        int[] result = {0,0,0};
        if(rounds > 10 || rounds < 1){
            System.out.println("Invalid Range");
        } else {
            boolean stillPlaying = true;
            while(stillPlaying){
                result = rpsGame(rounds);
                int ties = result[0];
                int uWins = result[1];
                int cWins = result[2];
                System.out.println("Number of ties     : " + ties);
                System.out.println("Number of user wins: " + uWins);
                System.out.println("Number of comp wins: " + cWins);
                if(uWins > cWins){
                    System.out.println("User wins..." + uWins + " to " + cWins);
                } else if(cWins > uWins){
                    System.out.println("Computer wins..." + cWins + " to " + uWins);
                } else {
                    System.out.println("User and Computer tied in number of games won!");
                }
                System.out.println();
                System.out.print("Would you like to play again? (Yes=1/No=0) ");
                int again = Integer.parseInt(input.nextLine());
                if(again == 0){
                    stillPlaying = false;
                } 
            }
        }
        
    }
    public static int[] rpsGame(int num){
        Scanner input = new Scanner(System.in);
        int[] ret = {0,0,0};
        for(int i = 0; i < num; i++){
            int userChoice = 0;
            boolean validChoice = false;
            while(!validChoice) {
                System.out.print("Rock (1), Paper (2), or Scissors (3)? ");
                userChoice = Integer.parseInt(input.nextLine());
                if(userChoice == 1 || userChoice == 2 || userChoice == 3){
                    validChoice = true;
                }
            }
            Random computerChoice = new Random();
            int seed = computerChoice.nextInt(2);
            switch (seed) {
                case 0:
                    switch (userChoice) {
                        case 1:
                            System.out.println("Tie, both chose Rock.");
                            ret[0]++;
                            break;
                        case 2:
                            System.out.println("User wins, Paper beats Rock.");
                            ret[1]++;
                            break;
                        case 3:
                            System.out.println("Computer wins, Rock beats Scissors.");
                            ret[2]++;
                            break;
                    }
                    break;
                case 1:
                    switch (userChoice) {
                        case 1:
                            System.out.println("Computer wins, Paper beats Rock.");
                            ret[2]++;
                            break;
                        case 2:
                            System.out.println("Tie, both chose Paper.");
                            ret[0]++;
                            break;
                        case 3:
                            System.out.println("User wins, Scissors beats Paper.");
                            ret[1]++;
                            break;
                    }
                    break;
                case 2:
                    switch (userChoice) {
                        case 1:
                            System.out.println("User wins, Rock beats Scissors.");
                            ret[1]++;
                            break;
                        case 2:
                            System.out.println("Computer wins, Scissors beats Paper.");
                            ret[2]++;
                            break;
                        case 3:
                            System.out.println("Tie, both chose Scissors.");
                            ret[0]++;
                            break;
                    }
                    break;
            }
            
        }
        return ret;
    }
}

