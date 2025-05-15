package collections;

public class car  extends  vehicle{
    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("Car stop");
    }
}
