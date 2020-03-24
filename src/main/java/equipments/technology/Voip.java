package equipments.technology;

import equipments.EquipmentType;

public class Voip extends AbstractTechnologyEquipment {

    public Voip(String IP) {
        super(IP);
        this.equipmentType = EquipmentType.VOIP;
    }

}
