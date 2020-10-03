package lt.boreisa.model.pojo;

public class Bus implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Bus driving..!");
    }
}
