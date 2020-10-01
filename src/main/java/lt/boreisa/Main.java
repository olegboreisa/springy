package lt.boreisa;

import lt.boreisa.model.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {

        // I DO NOT HAVE TO CREATE NEW OBJECT TO CHANGE ATTRIBUTES OR CALL METHODS, I JUST NEED TO CHANGE BEAN!

        //
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        Employee employee = context.getBean("employee", Employee.class);

        System.out.println(employee.toString());
        context.close();

    }
}
