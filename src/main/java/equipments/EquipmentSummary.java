package equipments;

import Team.AbstractTeamMember;

import java.util.List;
import java.util.Map;

public class EquipmentSummary {

    public String getTeamMemberEquipmentSummary(Map<String, List<IEquipment>> memberEquipment) {
        StringBuilder equipmentSummary = new StringBuilder();
        for (String EquipmentType : memberEquipment.keySet()) {
            int EquipmentTypeCount = memberEquipment.get(EquipmentType).size();
            equipmentSummary.append(EquipmentType).append(" - ").append(String.valueOf(EquipmentTypeCount)).append(System.lineSeparator());
        }
        return equipmentSummary.toString().trim();
    }

    public String getTeamEquipmentSummary(List<AbstractTeamMember> teamMembers) {
        StringBuilder teamEquipmentSummary = new StringBuilder();
        for (AbstractTeamMember teamMember : teamMembers) {
            Map<String, List<IEquipment>> teamMemberEquipments = teamMember.getMemberEquipments();
            if (!teamMemberEquipments.isEmpty()) {
                teamEquipmentSummary.append(teamMember.getName()).append(" from team - ")
                        .append(teamMember.getTeamName()).append(" equipment summary:").append(System.lineSeparator());
                teamEquipmentSummary.append(getTeamMemberEquipmentSummary(teamMemberEquipments)).append(System.lineSeparator());
            }
        }
        return teamEquipmentSummary.toString().trim();
    }
}
