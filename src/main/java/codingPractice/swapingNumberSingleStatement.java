package codingPractice;

public class swapingNumberSingleStatement {
    public static void main(String[]args){
        int a=10;
        int b=20;
        System.out.println("Before Swaping "+a+" "+b);
        b=a+b-(a=b);
        System.out.println("After  Swaping "+a+" "+b);
    }
}
