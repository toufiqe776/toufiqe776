package codingPractice;

public class ReverseNumber2 {
    public static void main(String[]args){
       /* StringBuffer rev;
        StringBuffer sb=new StringBuffer(String.valueOf(123));*/

       StringBuilder sb=new StringBuilder();
       sb.append(123);
       StringBuilder rev=sb.reverse();

        System.out.println(rev);
    }
}
