package equipments;

import Team.ITeamMember;

import java.util.List;
import java.util.Map;

public class EquipmentDescription {
    public String getEquipmentsDescription(List<AbstractEquipment> equipments){
        StringBuilder equipmentDescription = new StringBuilder();
        for (AbstractEquipment equipment : equipments) {
            equipmentDescription.append(equipment.getEquipmentDetails()).append(System.lineSeparator());
        }
        return equipmentDescription.toString().trim();
    }

    public String getTeamEquipmentDescription(Map<ITeamMember, List<AbstractEquipment>> teamEquipments){
        StringBuilder teamEquipmentDescription = new StringBuilder();
        for (ITeamMember teamMember: teamEquipments.keySet()) {
            teamEquipmentDescription.append(teamMember.getName()).append(" from team - ")
                    .append(teamMember.getTeamName()).append(" equipment details:").append(System.lineSeparator());
            teamEquipmentDescription.append(getEquipmentsDescription(teamMember.getEquipments())).append(System.lineSeparator());
        }
        return teamEquipmentDescription.toString().trim();
    }
}
