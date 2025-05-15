package collections;

public class bike  extends vehicle{
    @Override
    void stop() {
        System.out.println("bike stop");
    }

    @Override
    void start() {
        System.out.println("bike Started");
    }
}
