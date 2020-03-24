package Team;

import equipments.EquipmentDescription;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader extends TeamMember {
    public List<ITeamMember> teamMembers;

    public TeamLeader(String name, String teamName) {
        super(name, teamName);
        this.teamMembers = new ArrayList<ITeamMember>();
        this.addTeamMember(this);
    }

    public void addTeamMember(TeamMember newTeamMember) {
        this.teamMembers.add(newTeamMember);
    }

    public String getTeamEquipmentDetails() {
        StringBuilder teamEquipmentDetails = new StringBuilder();
        EquipmentDescription equipmentDescription = new EquipmentDescription();
        for (ITeamMember teamMember : this.teamMembers) {
            if (!teamMember.getEquipments().isEmpty()) {
                teamEquipmentDetails.append(teamMember.getName()).append(" from team - ")
                        .append(teamMember.getTeamName()).append(" equipment details:").append(System.lineSeparator());
                teamEquipmentDetails.append(equipmentDescription.getEquipmentsDescription(teamMember.getEquipments()))
                        .append(System.lineSeparator());
            }
        }
        return teamEquipmentDetails.toString().trim();
    }
}
