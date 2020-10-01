package lt.boreisa;

import lt.boreisa.model.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final String CONFIG_LOCATION = "beansConstructor.xml";
    private static final String CONFIG_LOCATION2 = "beansSetter.xml";


    public static void main(String[] args) {

        // I DO NOT HAVE TO CREATE NEW OBJECT TO CHANGE ATTRIBUTES OR CALL METHODS, I JUST NEED TO CHANGE BEAN!!

        // CONSTRUCTOR INJECTION
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        employee.show();
        context.close();

        System.out.println("_____________________");

        // SETTER INJECTION
        ConfigurableApplicationContext context2 = new ClassPathXmlApplicationContext(CONFIG_LOCATION2);
        Employee employee2 = context2.getBean("any", Employee.class);
        System.out.println(employee2.getId());
        System.out.println(employee2.getName());
        employee2.show();
        context2.close();

    }
}
