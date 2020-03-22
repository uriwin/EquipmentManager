package Team;

import equipments.Equipment;
import equipments.EquipmentStatus;
import equipments.technology.TechnologyEquipment;
import equipments.uniform.UniformEquipment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TeamMember {
    String name;
    String teamName;
    HashMap<String, List<Equipment>> memberEquipments;

    public TeamMember(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
        this.memberEquipments = new HashMap<String, List<Equipment>>();
    }

    public void addEquipment(Equipment equipment) {
        List<Equipment> equipmentType = this.memberEquipments.get(equipment.getEquipmentType());
        if (equipmentType == null) {
            equipmentType = new ArrayList<Equipment>();
            this.memberEquipments.put(equipment.getEquipmentType(), equipmentType);
        }
        equipmentType.add(equipment);
    }

    public StringBuilder getMemberEquipmentDetails() {
        StringBuilder equipmentsDetails = new StringBuilder();
        EquipmentStatus equipmentStatus = new EquipmentStatus();
        equipmentsDetails.append(this.name).append(" from team ").append(this.teamName).append(" - equipments details:").append(System.lineSeparator());
        equipmentsDetails.append(equipmentStatus.teamMemberEquipmentDetails(this.memberEquipments));
        return equipmentsDetails;
    }

    public StringBuilder getMemberEquipmentSummary() {
        StringBuilder equipmentSummary = new StringBuilder();
        EquipmentStatus equipmentStatus = new EquipmentStatus();
        equipmentSummary.append(this.name).append(" from team ").append(this.teamName).append(" - equipments summary:").append(System.lineSeparator());
        equipmentSummary.append(equipmentStatus.teamMemberEquipmentSummary(this.memberEquipments));
        return equipmentSummary;
    }

    public void printEquipment() {
        System.out.println(getMemberEquipmentDetails());
        System.out.println(getMemberEquipmentSummary());
    }
}
