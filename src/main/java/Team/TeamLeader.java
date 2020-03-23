package Team;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader extends TeamMember {
    public List<AbstractTeamMember> teamMembers;

    public TeamLeader(String name, String teamName) {
        super(name, teamName);
        this.teamMembers = new ArrayList<AbstractTeamMember>();
        this.addTeamMember(this);
    }

    public void addTeamMember(AbstractTeamMember newTeamMember) {
        this.teamMembers.add(newTeamMember);
    }

    public String getTeamEquipmentDetails() {
        StringBuilder teamEquipmentDetails = new StringBuilder();
        for (AbstractTeamMember teamMember : this.teamMembers) {
            if (!teamMember.memberEquipments.isEmpty()) {
                teamEquipmentDetails.append(teamMember.name).append(" from team - ").append(teamMember.teamName)
                        .append(" equipment details:").append(System.lineSeparator());
                teamEquipmentDetails.append(teamMember.getEquipmentDetails()).append(System.lineSeparator());
            }
        }
        return teamEquipmentDetails.toString().trim();
    }
}
