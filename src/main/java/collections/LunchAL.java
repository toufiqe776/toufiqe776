package collections;

import java.util.ArrayList;

public class LunchAL {
    public static void main(String[]args){
        ArrayList al=new ArrayList();//ArrayList is an index base ds
        al.add(110);
        al.add(100);
        al.add("String");
        al.add('q');
        al.add(1.2);
        al.add(1,20);
        al.add(0,190);

        System.out.println(al);
        al.set(0,130);   // replace exiting value and set this value
        System.out.println(al);

        System.out.println(al.size());//size of ArrayList
        System.out.println(al.clone());// Duplicate ArrayList
       // al.clear();//clear ArrayList and empty ArrayList Return
        //System.out.println(al);
        al.ensureCapacity(10);
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al.hashCode());
        System.out.println(al.indexOf(100)); //return index value for given object if object not exit -1 will return
        System.out.println(al.lastIndexOf(110));
        al.trimToSize();
        System.out.println(al.size());



    }
}
