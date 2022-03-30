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
import java.text.DecimalFormat;
import java.lang.Math;

public class HealthyHearts {
    public static void main(String[] args){
        System.out.print("What is your age? ");
        Scanner input = new Scanner(System.in);
        int age = Integer.parseInt(input.nextLine());
        calcHeart(age);
    }
    public static void calcHeart(int num){
        int heartRate = 220 - num;
        DecimalFormat df = new DecimalFormat("");
        double hrZoneLower = Math.ceil(heartRate*0.5);
        double hrZoneUpper = Math.ceil(heartRate*0.85);
        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + df.format(hrZoneLower) + " - " + df.format(hrZoneUpper) + " beats per minute");
    }
}
