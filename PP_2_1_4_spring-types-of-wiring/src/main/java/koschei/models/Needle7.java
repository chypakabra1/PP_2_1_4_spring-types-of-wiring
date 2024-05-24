package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    /*private final Deth8 deth = new Deth8();

    @Override
    public String toString() {
        return ", смерть Кощея на игле " + deth.toString();
    }*/

    @Autowired
    private Deth8 Deth;

    @Override
    public String toString() {
        return ", смерть Кощея на игле " + Deth.toString();
    }
}
