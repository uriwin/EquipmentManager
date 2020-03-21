package equipments.technology;

public class InternetComputer extends TechnologyEquipment {
    public InternetComputer(String IP){
        this.IP = IP;
        this.technologyEquipmentType = "Internet Computer";
    }
    public String equipmentType() {
        return "Internet Computer";
    }

}
