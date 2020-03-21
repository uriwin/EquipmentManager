package equipments.technology;

import equipments.technology.TechnologyEquipment;

public class Voip extends TechnologyEquipment {

    public Voip(String IP){
        this.IP = IP;
        this.technologyEquipmentType = "Voip";
    }
    public String equipmentType() {
        return this.technologyEquipmentType;
    }
}
