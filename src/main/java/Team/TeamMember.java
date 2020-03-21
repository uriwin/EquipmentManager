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
    HashMap<String, List<UniformEquipment>> memberUniformEquipment;
    HashMap<String, List<TechnologyEquipment>> memberTechnologyEquipment;

    public TeamMember(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
        memberUniformEquipment = new HashMap<String, List<UniformEquipment>>();
        memberTechnologyEquipment = new HashMap<String, List<TechnologyEquipment>>();
    }

    public void addUniformEquipment(UniformEquipment equipment) {
        List<UniformEquipment> newUniformEquipmentType = memberUniformEquipment.get(equipment.equipmentType());
        if (newUniformEquipmentType == null) {
            newUniformEquipmentType = new ArrayList<UniformEquipment>();
            memberUniformEquipment.put(equipment.equipmentType(), newUniformEquipmentType);
        }
        newUniformEquipmentType.add(equipment);
    }

    public void addTechnologyEquipment(TechnologyEquipment equipment) {
        List<TechnologyEquipment> TechnologyEquipmentType = memberTechnologyEquipment.get(equipment.equipmentType());
        if (TechnologyEquipmentType == null) {
            TechnologyEquipmentType = new ArrayList<TechnologyEquipment>();
            memberTechnologyEquipment.put(equipment.equipmentType(), TechnologyEquipmentType);
        }
        TechnologyEquipmentType.add(equipment);
    }

    public void printEquipment() {
        String equipmentsDetails = "";
        String equipmentSummary = "";

        System.out.println(this.name + " from team " + this.teamName + " - equipments details:");
        equipmentsDetails += EquipmentStatus.teamMemberEquipmentDetails(this.memberUniformEquipment);
        if (!equipmentsDetails.equals(""))
            equipmentsDetails += System.lineSeparator();
        equipmentsDetails += EquipmentStatus.teamMemberEquipmentDetails(this.memberTechnologyEquipment);
        System.out.println(equipmentsDetails);

        System.out.println(this.name + " from team " + this.teamName + " - equipments summary:");
        equipmentSummary += EquipmentStatus.teamMemberEquipmentSummary(this.memberUniformEquipment);
        if (!equipmentSummary.equals(""))
            equipmentSummary += System.lineSeparator();
        equipmentSummary += EquipmentStatus.teamMemberEquipmentSummary(this.memberTechnologyEquipment);
        System.out.println(equipmentSummary);
    }
}
