package codingPractice;

public class ReverseNumber {
    public static void main(String[]args){
        int num=123;
        int rem;
        while(num >0){
            rem=num%10;
            System.out.print(rem);
            num=num/10;
        }

    }
}
