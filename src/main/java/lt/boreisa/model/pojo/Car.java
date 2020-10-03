package lt.boreisa.model.pojo;

public class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Car driving..!");
    }
}
