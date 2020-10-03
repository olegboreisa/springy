package lt.boreisa;

import lt.boreisa.model.Address;
import lt.boreisa.model.Employee;
import lt.boreisa.model.pojo.Bus;
import lt.boreisa.model.pojo.Car;
import lt.boreisa.model.pojo.Vehicle;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final String CONFIG_LOCATION = "beans.xml";
    private static final String CONFIG_LOCATION_2 = "springBeans.xml";
    private static final String CONFIG_LOCATION_ANNOTATION = "annotationsBeans.xml";

    public static void main(String[] args) {

        // I DO NOT HAVE TO CREATE NEW OBJECT TO CHANGE ATTRIBUTES OR CALL METHODS, I JUST NEED TO CHANGE BEAN!
        // LOOSE-COUPLING - I DO NOT CREATE ADDRESS OBJECT DIRECTLY, I DO IT THROUGH BEAN.XML!

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());
        context.close();

        // THAT I WOULD HAVE TO DO IF I USED OLD METHOD (TIGHT-COUPLING)

        Address address = new Address("Vilnius", "Vilnius State", "Lithuania");
        Employee employee1 = new Employee(3, "Andrew", address);
        System.out.println(employee1.toString());
        // OOOORRR (! EMPLOYEE DE
        Employee employee2 = new Employee(4, "Sarah", new Address("Malibu", "California", "United States"));
        System.out.println(employee2.toString());
        System.out.println("_________________________");

        // WE WOULD NEED TO DO THIS. BOTH SIDE ARE DEPENDENT [LEFT AND RIGHT SIDE]
        Bus bus = new Bus();
        bus.drive();
        Car car = new Car();
        car.drive();

        // IF WE CREATE INTERFACE WE LOOSE ONE DEPENDENT SIDE [LEFT SIDE] BUT IT IS NOT ENOUGH!
        Vehicle bus1 = new Bus();
        bus1.drive();
        Vehicle car1 = new Car();
        car1.drive();

        System.out.println("_________________________");
        /* IF WE USE SPRING FRAMEWORK AND APPLICATION CONTEXT INTERFACE WE LOOSE ANOTHER DEPENDENT SIDE [RIGHT SIDE]
         IT IS IMPORTANT TO CAST BECAUSE GET BEAN RETURN AN OBJECT! WE NEED TO INDICATE CASTING AND INTERFACE IN BETWEEN BRACKETS
         ANOTHER EXAMPLE OF HOW TO USE SPRING FRAMEWORK */
        ConfigurableApplicationContext contextPOJO = new ClassPathXmlApplicationContext(CONFIG_LOCATION_2);
        Vehicle obj = (Vehicle) contextPOJO.getBean("vehicle");
        obj.drive();
        contextPOJO.close();

        System.out.println("_________________________");
        /* WE NEED TO SPECIFY WHAT CLASS ARE WE USING FROM INTERFACE IN GET BEANS BRACKETS. IN THIS CASE IT IS EITHER CAR
        OR BUS */
        ConfigurableApplicationContext contextANNOTATIONS = new ClassPathXmlApplicationContext(CONFIG_LOCATION_ANNOTATION);
        Vehicle annotatedObj = (Vehicle) contextANNOTATIONS.getBean("bus");
        annotatedObj.drive();
        contextANNOTATIONS.close();

    }
}
