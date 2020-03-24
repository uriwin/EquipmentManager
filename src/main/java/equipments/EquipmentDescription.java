package equipments;

import java.util.List;

public class EquipmentDescription {
    public String getEquipmentsDescription(List<AbstractEquipment> equipments){
        StringBuilder equipmentDetails = new StringBuilder();
        for (AbstractEquipment equipment : equipments) {
            equipmentDetails.append(equipment.getEquipmentDetails()).append(System.lineSeparator());
        }
        return equipmentDetails.toString().trim();
    }
}
