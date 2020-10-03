package lt.boreisa.model.annotationBased;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

    @Autowired // SEARCHING FOR THE OBJECT
    //@QUALIFER("/snapdragon OR /mediaTek")
    private MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void spec () {
        System.out.println("Octa Core, 4 GB RAM");
        cpu.process();
    }
}
