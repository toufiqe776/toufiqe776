package codingPractice;

public class swapingNumber {
    public static void main(String[]args){
        //with using third variable
        int a=10;
        int b=20;
        System.out.println("Before Swaping "+a +" "+b);
        a=a+b; //10+20=30
        b=a-b;//30-20=10
        a=a-b; //30-10=20
        System.out.println("Before Swaping "+a +" "+b);


    }
}
