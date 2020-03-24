package equipment.describer;

import equipment.AbstractEquipment;
import equipment.describer.EquipmentDescriber;
import team.ITeamMember;

import java.util.List;
import java.util.Map;

public class TeamEquipmentDescriber {
    public String getTeamEquipmentDescription(Map<ITeamMember, List<AbstractEquipment>> teamEquipments) {
        StringBuilder teamEquipmentDescription = new StringBuilder();
        EquipmentDescriber equipmentDescriber = new EquipmentDescriber();
        for (ITeamMember teamMember : teamEquipments.keySet()) {
            teamEquipmentDescription.append(teamMember.getName()).append(" from team - ")
                    .append(teamMember.getTeamName()).append(" equipment details:").append(System.lineSeparator());
            teamEquipmentDescription.append(equipmentDescriber.getEquipmentsDescription(teamMember.getEquipments()))
                    .append(System.lineSeparator());
        }
        return teamEquipmentDescription.toString().trim();
    }
}
