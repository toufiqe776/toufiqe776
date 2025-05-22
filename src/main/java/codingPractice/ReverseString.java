package codingPractice;

public class ReverseString {
    public static void main(String[]args){
        String str="ABCD";
        String rev="";
       /* int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);*/
       //using char array
      /* char a[]=str.toCharArray();
       int len =a.length;
       for(int i=len-1;i>=0;i--){
           rev=rev+a[i];
       }
        System.out.println(rev);*/
      /* using Stringbuffer class
      StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());*/
      StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
