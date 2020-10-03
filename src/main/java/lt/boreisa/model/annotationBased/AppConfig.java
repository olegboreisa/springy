package lt.boreisa.model.annotationBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// THIS CLASS IS GIVING YOU OBJECTS
//@ComponentScan(basePackages = (lt.boreisa.model.annotationBased)). DELETE @BEAN and ADD @COMPONENT(@PRIMARY ANNOTATION IF NEEDED, IF MORE THAN TWO OBJECTS [MOBILE PROCESSOR].
@Configuration
public class AppConfig {

    @Bean
    public Samsung getPhone () {
        return new Samsung();
    }

    @Bean
    public MobileProcessor getProcessor (){
        return new Snapdragon();
    }
}

/// EITHER USE @BEAN, OR USE @COMPONENT [DEFAULT - NON QUALIFIED AND DE CAPITALISED
// INSIDE CLASSES BUT DO NOT FORGER TO ADD @COMPONENT SCAN (basePackages="")
