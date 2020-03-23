package Team;

import equipments.IEquipment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractTeamMember implements ITeamMember {
    String name;
    String teamName;
    Map<String, List<IEquipment>> memberEquipments;

    public AbstractTeamMember(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
        this.memberEquipments = new HashMap<String, List<IEquipment>>();
    }

    public void addEquipment(IEquipment equipment) {
        List<IEquipment> memberEquipmentTypeObjects = this.memberEquipments.get(equipment.getEquipmentType());
        if (memberEquipmentTypeObjects == null) {
            memberEquipmentTypeObjects = new ArrayList<IEquipment>();
            this.memberEquipments.put(equipment.getEquipmentType(), memberEquipmentTypeObjects);
        }
        memberEquipmentTypeObjects.add(equipment);
    }

    public String getEquipmentDetails() {
        StringBuilder equipmentDetails = new StringBuilder();
        for (String equipmentType : this.memberEquipments.keySet()) {
            List<IEquipment> equipmentTypeObjects = this.memberEquipments.get(equipmentType);
            for (IEquipment equipmentTypeObject : equipmentTypeObjects) {
                equipmentDetails.append(equipmentTypeObject.getEquipmentDetails()).append(System.lineSeparator());
            }
        }
        return equipmentDetails.toString().trim();
    }

    public Map<String, List<IEquipment>> getMemberEquipments() {
        return memberEquipments;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }
}
