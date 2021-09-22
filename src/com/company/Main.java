package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.print("Enter array size: ");
        int arrLength = sc.nextInt();
        int [] arr = new int[arrLength];
        do {
            System.out.print("Enter array item: ");
            arr[i] = sc.nextInt();
            i++;
        } while (i < arrLength);
        System.out.print("You entered an array: ");
        for(int item : arr) {
            System.out.print(item + " ");
        }
    }
}
