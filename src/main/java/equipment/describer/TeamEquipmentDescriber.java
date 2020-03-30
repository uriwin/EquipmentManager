package equipment.describer;

import team.ITeamMember;

import java.util.List;

public class TeamEquipmentDescriber {
    public String getTeamEquipmentDescription(List<ITeamMember> teamMembers) {
        StringBuilder teamEquipmentDescription = new StringBuilder();
        EquipmentDescriber equipmentDescriber = new EquipmentDescriber();
        for (ITeamMember teamMember : teamMembers) {
            teamEquipmentDescription.append(teamMember.getName())
                    .append(" from team - ")
                    .append(teamMember.getTeamName())
                    .append(" equipments description:")
                    .append(System.lineSeparator())
                    .append(equipmentDescriber.getEquipmentsDescription(teamMember.getEquipments()))
                    .append(System.lineSeparator());
        }
        return teamEquipmentDescription.toString().trim();
    }
}
