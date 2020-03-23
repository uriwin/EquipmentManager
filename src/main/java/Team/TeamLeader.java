package Team;

import equipments.EquipmentStatus;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader extends AbstractTeamMember {
    public List<AbstractTeamMember> teamMembers;

    public TeamLeader(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
        this.teamMembers = new ArrayList<AbstractTeamMember>();
        this.addTeamMember(this);
    }

    public void addTeamMember(AbstractTeamMember newTeamMember) {
        this.teamMembers.add(newTeamMember);
    }

    public StringBuilder getTeamEquipmentStatus() {
        StringBuilder teamEquipmentStatus = new StringBuilder();
        for (AbstractTeamMember teamMember : this.teamMembers) {
            teamEquipmentStatus.append(teamMember.getMemberEquipmentDetailsAndSummary());
        }
        return teamEquipmentStatus;
    }
}
