package lt.boreisa.model.pojo;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Bus driving..!");
    }
}
