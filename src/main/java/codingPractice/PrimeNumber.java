package codingPractice;

public class PrimeNumber {
    public static void main(String[]args){
        int num=9;
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count ++;
            }
        }

        if(count==0){
            System.out.println(num +" is a Prime Number: ");
        }else{
            System.out.println(num+" is not a Prime Number:");
        }
    }
}
