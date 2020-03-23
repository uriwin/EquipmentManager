package equipments;

import java.util.HashMap;
import java.util.List;

public class EquipmentStatus {
    public String teamMemberEquipmentDetails(HashMap<String, List<IEquipment>> memberEquipment) {
        String equipmentDetails = "";
        for (String equipmentType : memberEquipment.keySet()) {
            List<IEquipment> equipmentTypeObjects = memberEquipment.get(equipmentType);
            for (IEquipment equipmentTypeObject : equipmentTypeObjects) {
                equipmentDetails += equipmentTypeObject.getEquipmentDetails() + System.lineSeparator();
            }
        }
        return equipmentDetails.trim();
    }

    public String teamMemberEquipmentSummary(HashMap<String, List<IEquipment>> memberEquipment) {
        String equipmentSummary = "";
        for (String EquipmentType : memberEquipment.keySet()) {
            int EquipmentTypeCount = memberEquipment.get(EquipmentType).size();
            equipmentSummary += EquipmentType + " - " + String.valueOf(EquipmentTypeCount) + System.lineSeparator();
        }
        return equipmentSummary.trim();
    }
}
