package Team;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader extends TeamMember {
    public List<TeamMember> teamMembers;
    public TeamLeader(String name, String teamName) {
        super(name, teamName);
        this.teamMembers = new ArrayList<TeamMember>();
        this.teamMembers.add(this);
    }

    public void addTeamMember(TeamMember newTeamMember){
        this.teamMembers.add(newTeamMember);
    }

    public void printAllTeamEquipment(){
        for (TeamMember teamMember: this.teamMembers) {
            teamMember.printEquipment();
        }
    }
}
