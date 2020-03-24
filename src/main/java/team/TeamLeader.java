package team;

import equipments.AbstractEquipment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<ITeamMember, List<AbstractEquipment>> getTeamEquipments() {
        Map<ITeamMember, List<AbstractEquipment>> teamEquipments = new HashMap<ITeamMember, List<AbstractEquipment>>();
        for (ITeamMember teamMember : this.teamMembers) {
            if (!teamMember.getEquipments().isEmpty()) {
                teamEquipments.put(teamMember, teamMember.getEquipments());
            }
        }
        return teamEquipments;
    }
}
