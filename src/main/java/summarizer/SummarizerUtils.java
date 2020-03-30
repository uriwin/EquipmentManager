package summarizer;

import equipment.AbstractEquipment;
import equipment.IEquipmentType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummarizerUtils {
    public Map<IEquipmentType, Integer> CountEquipmentTypesAppearances(List<AbstractEquipment> equipments) {
        Map<IEquipmentType, Integer> countEquipmentTypesAppearances = new HashMap<IEquipmentType, Integer>();
        for (AbstractEquipment equipment : equipments) {
            countEquipmentTypesAppearances.merge(equipment.getEquipmentType(), 1, Integer::sum);
        }
        return countEquipmentTypesAppearances;
    }
}
