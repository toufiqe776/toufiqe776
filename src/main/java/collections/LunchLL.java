package collections;

import java.util.LinkedList;

public class LunchLL {
    public static void main(String[]args){
        LinkedList ll=new LinkedList();//
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.add(500);
        ll.add(100);
        System.out.println(ll);
        ll.add(190);
        System.out.println(ll);
        ll.addFirst(200);
        System.out.println(ll);
        ll.addLast(300);
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll.get(1));



    }
}
