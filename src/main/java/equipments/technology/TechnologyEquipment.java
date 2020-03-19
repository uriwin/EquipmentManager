package equipments.technology;

import equipments.Equipment;

public abstract class TechnologyEquipment implements Equipment {
    public String IP;
    public  String getIp(){
        return IP;
    };

    public void setIP(String IP) {
        this.IP = IP;
    }
}
