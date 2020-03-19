package Team;

import equipments.technology.TechnologyEquipment;
import equipments.uniform.UniformEquipment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TeamMember {
    String name;
    String teamName;
    HashMap<String, List<UniformEquipment>> memberUniformEquipment;
    HashMap<String, List<TechnologyEquipment>> memberTechnologyEquipment;

    public TeamMember(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
        memberUniformEquipment = new HashMap<String, List<UniformEquipment>>();
        memberTechnologyEquipment = new HashMap<String, List<TechnologyEquipment>>();
    }

    public void addUniformEquipment(UniformEquipment equipment) {
        List<UniformEquipment> newUniformEquipmentType = memberUniformEquipment.get(equipment.equipmentType());
        if (newUniformEquipmentType == null) {
            newUniformEquipmentType = new ArrayList<UniformEquipment>();
            memberUniformEquipment.put(equipment.equipmentType(), newUniformEquipmentType);
        }
        newUniformEquipmentType.add(equipment);
    }

    public void addTechnologyEquipment(TechnologyEquipment equipment) {
        List<TechnologyEquipment> TechnologyEquipmentType = memberTechnologyEquipment.get(equipment.equipmentType());
        if (TechnologyEquipmentType == null) {
            TechnologyEquipmentType = new ArrayList<TechnologyEquipment>();
            memberTechnologyEquipment.put(equipment.equipmentType(), TechnologyEquipmentType);
        }
        TechnologyEquipmentType.add(equipment);
    }

    public void printEquipment() {
        for (String uniformEquipmentType : this.memberUniformEquipment.keySet()) {
            int uniformEquipmentTypeCount = memberUniformEquipment.get(uniformEquipmentType).size();
            System.out.println(this.name + " from team " + this.teamName + " have: " + String.valueOf(uniformEquipmentTypeCount) + " " + uniformEquipmentType);

        }

        for (String technologyEquipmentType : this.memberTechnologyEquipment.keySet()) {
            int technologyEquipmentTypeCount = memberTechnologyEquipment.get(technologyEquipmentType).size();
            System.out.println(this.name + " from team " + this.teamName + " have: " + String.valueOf(technologyEquipmentTypeCount) + " " + technologyEquipmentType);

        }
    }
}
