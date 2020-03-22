package Team;

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
        List<UniformEquipment> newUniformEquipmentType = memberUniformEquipment.get(equipment.getEquipmentType());
        if (newUniformEquipmentType == null) {
            newUniformEquipmentType = new ArrayList<UniformEquipment>();
            memberUniformEquipment.put(equipment.getEquipmentType(), newUniformEquipmentType);
        }
        newUniformEquipmentType.add(equipment);
    }

    public void addTechnologyEquipment(TechnologyEquipment equipment) {
        List<TechnologyEquipment> TechnologyEquipmentType = memberTechnologyEquipment.get(equipment.getEquipmentType());
        if (TechnologyEquipmentType == null) {
            TechnologyEquipmentType = new ArrayList<TechnologyEquipment>();
            memberTechnologyEquipment.put(equipment.getEquipmentType(), TechnologyEquipmentType);
        }
        TechnologyEquipmentType.add(equipment);
    }

    public StringBuilder getMemberEquipmentDetails(){
        StringBuilder equipmentsDetails = new StringBuilder();
        equipmentsDetails.append(this.name).append(" from team ").append(this.teamName).append(" - equipments details:");
        equipmentsDetails.append(EquipmentStatus.teamMemberEquipmentDetails(this.memberUniformEquipment));
        if (equipmentsDetails.length() != 0)
            equipmentsDetails.append(System.lineSeparator());
        equipmentsDetails.append(EquipmentStatus.teamMemberEquipmentDetails(this.memberTechnologyEquipment));
        return equipmentsDetails;
    }

    public StringBuilder getMemberEquipmentSummary(){
        StringBuilder equipmentSummary = new StringBuilder();
        equipmentSummary.append(this.name).append(" from team ").append(this.teamName).append(" - equipments summary:");
        equipmentSummary.append(EquipmentStatus.teamMemberEquipmentSummary(this.memberUniformEquipment));
        if (equipmentSummary.length() != 0)
            equipmentSummary.append(System.lineSeparator());
        equipmentSummary.append(EquipmentStatus.teamMemberEquipmentSummary(this.memberTechnologyEquipment));
        return equipmentSummary;
    }

    public void printEquipment() {
        System.out.println(getMemberEquipmentDetails());
        System.out.println(getMemberEquipmentSummary());
    }
}
