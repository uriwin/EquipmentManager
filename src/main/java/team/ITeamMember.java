package team;

import equipment.AbstractEquipment;

import java.util.List;

public interface ITeamMember {
    public void addEquipment(AbstractEquipment equipment);

    public String getName();

    public String getTeamName();

    public List<AbstractEquipment> getEquipments();
}
