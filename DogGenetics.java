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

public class DogGenetics {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your dog's name? ");
        String name = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println();
        System.out.println(name + " is:");
        System.out.println();
        dnaBackground();
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
    }
    public static void dnaBackground(){
        Random rand = new Random();
        int firstValue = rand.nextInt(100);
        int secondValue = rand.nextInt(100);
        int thirdValue = rand.nextInt(100);
        int fourthValue = rand.nextInt(100);
        int fifthValue = rand.nextInt(100);
        boolean one_hundred = false;
        while(!one_hundred){
            int sum = firstValue+secondValue+thirdValue+fourthValue+fifthValue;
            if(sum==100){
                one_hundred = true;
            } else {
                int subtractIndex = rand.nextInt(4);
                switch (subtractIndex){
                    case 0:
                        if(firstValue == 1){
                            break;
                        }
                        firstValue--;
                        break;
                    case 1:
                        if(secondValue == 1){
                            break;
                        }
                        secondValue--;
                        break;
                    case 2:
                        if(thirdValue == 1){
                            break;
                        }
                        thirdValue--;
                        break;
                    case 3:
                        if(fourthValue == 1){
                            break;
                        }
                        fourthValue--;
                        break;
                    case 4:
                        if(fifthValue == 1){
                            break;
                        }
                        fifthValue--;
                        break;
                }
            }
        }
        System.out.println(firstValue + "% St. Bernard");
        System.out.println(secondValue + "% Chihuahua");
        System.out.println(thirdValue + "% Dramatic RedNosed Asian Pug");
        System.out.println(fourthValue + "% Common Cur");
        System.out.println(fifthValue + "% King Doberman");
    }
}
