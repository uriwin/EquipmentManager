package equipments.technology;

import equipments.technology.TechnologyEquipment;

public class Voip extends TechnologyEquipment {
    long voipNumber;
    public Voip(String IP){
        this.IP = IP;
    }
    public String equipmentType() {
        return "Voip";
    }
}
