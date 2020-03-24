package equipments.technology;

import equipments.AbstractEquipment;

public abstract class AbstractTechnologyEquipment extends AbstractEquipment {
    public String IP;
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
        return "Technology equipment type: " + this.equipmentType + ", IP: " + this.IP;
    }
}
