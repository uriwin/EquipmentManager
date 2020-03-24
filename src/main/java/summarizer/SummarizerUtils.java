package summarizer;

import equipments.AbstractEquipment;
import equipments.EquipmentType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummarizerUtils {
    public Map<EquipmentType, Integer> CountEquipmentTypesAppearances(List<AbstractEquipment> equipments){
        Map<EquipmentType, Integer> countEquipmentTypesAppearances = new HashMap<EquipmentType, Integer>();
        for (AbstractEquipment equipment: equipments) {
            countEquipmentTypesAppearances.merge(equipment.getEquipmentType(), 1, Integer::sum);
        }
        return countEquipmentTypesAppearances;
    }
}
