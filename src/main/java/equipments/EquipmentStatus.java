package equipments;

import java.util.HashMap;
import java.util.List;

public class EquipmentStatus {
    public static <T extends Equipment> String teamMemberEquipmentDetails(HashMap<String, List<T>> memberEquipment) {
        String equipmentDetails = "";
        for (String equipmentType : memberEquipment.keySet()) {
            List<T> equipmentTypeObjects = memberEquipment.get(equipmentType);
            for (T equipmentTypeObject : equipmentTypeObjects) {
                equipmentDetails += equipmentTypeObject.getEquipmentDetails() + System.lineSeparator();
            }
        }
        return equipmentDetails.trim();
    }

    public static <T extends Equipment> String teamMemberEquipmentSummary(HashMap<String, List<T>> memberEquipment) {
        String equipmentSummary = "";
        for (String EquipmentType : memberEquipment.keySet()) {
            int EquipmentTypeCount = memberEquipment.get(EquipmentType).size();
            equipmentSummary += EquipmentType + " - " + String.valueOf(EquipmentTypeCount) + System.lineSeparator();
        }
        return equipmentSummary.trim();
    }
}
