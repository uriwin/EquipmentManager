package Team;

import equipments.AbstractEquipment;

import java.util.ArrayList;
import java.util.List;

public class TeamMember implements ITeamMember {
    String name;
    String teamName;
    List<AbstractEquipment> equipments;


    public TeamMember(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
        this.equipments = new ArrayList<AbstractEquipment>();
    }

    public void addEquipment(AbstractEquipment equipment) {
        equipments.add(equipment);
    }

    public List<AbstractEquipment> getEquipments() {
        return equipments;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }
}
