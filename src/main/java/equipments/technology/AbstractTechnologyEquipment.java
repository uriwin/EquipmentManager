package equipments.technology;

import equipments.IEquipment;

public abstract class AbstractTechnologyEquipment implements IEquipment {
    public String IP;
    public String technologyEquipmentType;

    public AbstractTechnologyEquipment(String IP){
        this.IP = IP;
    }

    public String getIp() {
        return IP;
    }
    public void setIP(String IP) {
        this.IP = IP;
    }

    @Override
    public String getEquipmentDetails() {
        return "Technology equipment type: " + this.technologyEquipmentType + ", IP: " + this.IP;
    }

    @Override
    public String getEquipmentType() {
        return this.technologyEquipmentType;
    }
}
