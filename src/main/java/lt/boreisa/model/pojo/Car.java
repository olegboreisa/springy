package lt.boreisa.model.pojo;


import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Car driving..!");
    }
}
