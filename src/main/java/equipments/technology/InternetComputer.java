package equipments.technology;

import equipments.EquipmentType;

public class InternetComputer extends AbstractTechnologyEquipment {
    public InternetComputer(String IP) {
        super(IP);
        this.equipmentType = EquipmentType.InternetComputer;
    }

}
