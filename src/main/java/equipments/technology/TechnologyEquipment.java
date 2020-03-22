package equipments.technology;

import equipments.Equipment;

public abstract class TechnologyEquipment implements Equipment {
    public String IP;
    public String technologyEquipmentType;

    public String getIp() {
        return IP;
    }

    ;

    public void setIP(String IP) {
        this.IP = IP;
    }

    @Override
    public String getEquipmentDetails() {
        return "Technology equipment type: " + this.technologyEquipmentType + ", IP: " + this.IP;
    }

    @Override
    public String getEquipmentType() {
        return "Army Computer";
    }
}
