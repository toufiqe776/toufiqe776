package codingPractice;

import java.util.Scanner;

public class ReverseNumber1 {
    public static void main(String[]args){
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse Number :"+rev);
    }
}
