/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author 17202
 */
public class SummativeSums {
    public static void main(String[] args){
        int arr1[] = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int arr2[] = { 999, -60, -77, 14, 160, 301 };
        int arr3[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 } ;
        
        int sum1 = sumArray(arr1);
        int sum2 = sumArray(arr2);
        int sum3 = sumArray(arr3);
        
        System.out.println("#1 Array Sum: " + sum1);
        System.out.println("#2 Array Sum: " + sum2);
        System.out.println("#3 Array Sum: " + sum3);
        
    }
    public static int sumArray(int[] arr){
        int size = arr.length;
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
