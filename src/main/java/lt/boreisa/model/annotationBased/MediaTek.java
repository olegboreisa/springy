package lt.boreisa.model.annotationBased;


import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor{

    @Override
    public void process() {
        System.out.println("Second Best CPU");
    }
}
