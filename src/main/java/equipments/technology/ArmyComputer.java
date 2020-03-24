package equipments.technology;

import equipments.EquipmentType;

public class ArmyComputer extends AbstractTechnologyEquipment {
    public ArmyComputer(String IP) {
        super(IP);
        this.equipmentType = EquipmentType.ArmyComputer;
    }
}
