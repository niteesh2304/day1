package day1;

import java.util.Scanner;
// Write a Java program to find maximum between two numbers. 
public class hw{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int a = sc.nextInt();

        System.out.println("Enter the second value:");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a);
        }
        else if(a<b){
            System.out.println(b);
        }
    }
}