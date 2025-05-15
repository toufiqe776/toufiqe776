package collections;

public class Base {
    public static void main(String[]args){
        Person p=new Engineer();
        p.work();
       container c=new container();
      c.setLiquid("800");
      System.out.println(c.getLiquid() );
        car c1=new car();
        c1.start();
        c1.stop();
        bike b=new bike();
        b.start();
        b.stop();
        Car1 c2=new Car1();
        System.out.println(c2.maxSpped);
        c2.start();
        c2.stop();
    }
}
