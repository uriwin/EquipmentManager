package equipments.technology;

public class InternetComputer extends TechnologyEquipment {
    public InternetComputer(String IP){
        this.IP = IP;
    }
    public String equipmentType() {
        return "Internet Computer";
    }

}
