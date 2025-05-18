package codingPractice;

public class SwapingNumberMultiAndDivi {
   public static void main(String []args){
       int a=10;
       int b=20;
       System.out.println("Before Swaping "+a +" "+b);
       a=a*b; //10*20=200
       b=a/b;// 200/20=10
       a=a/b ;//200/10=20

       System.out.println("After Swaping "+a +" "+b);



   }

}
