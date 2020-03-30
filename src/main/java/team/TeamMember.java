package team;

import equipment.AbstractEquipment;

import java.util.ArrayList;
import java.util.List;

public class TeamMember implements ITeamMember {
    String name;
    String teamName;
    List<AbstractEquipment> equipments;


    public TeamMember(String name, String teamName) {
        this.setName(name);
        this.setTeamName(teamName);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
