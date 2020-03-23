package Team;

import equipments.IEquipment;
import equipments.EquipmentStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AbstractTeamMember implements ITeamMember {
    String name;
    String teamName;
    HashMap<String, List<IEquipment>> memberEquipments = new HashMap<String, List<IEquipment>>();

    public void addEquipment(IEquipment equipment) {
        List<IEquipment> equipmentType = this.memberEquipments.get(equipment.getEquipmentType());
        if (equipmentType == null) {
            equipmentType = new ArrayList<IEquipment>();
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

    public StringBuilder getMemberEquipmentDetailsAndSummary() {
        StringBuilder equipmentStatus = new StringBuilder();
        equipmentStatus.append(this.getMemberEquipmentDetails());
        if (equipmentStatus.length() != 0)
            equipmentStatus.append(System.lineSeparator());
        equipmentStatus.append(this.getMemberEquipmentSummary());
        if (equipmentStatus.length() != 0)
            equipmentStatus.append(System.lineSeparator());
        return equipmentStatus;
    }
}
