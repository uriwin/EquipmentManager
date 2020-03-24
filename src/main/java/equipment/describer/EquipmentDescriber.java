package equipment.describer;

import equipment.AbstractEquipment;

import java.util.List;

public class EquipmentDescriber {
    public String getEquipmentsDescription(List<AbstractEquipment> equipments) {
        StringBuilder equipmentDescription = new StringBuilder();
        for (AbstractEquipment equipment : equipments) {
            equipmentDescription.append(equipment.getEquipmentDetails()).append(System.lineSeparator());
        }
        return equipmentDescription.toString().trim();
    }


}
