package equipments.technology;

public class ArmyComputer extends TechnologyEquipment {
    public ArmyComputer(String IP){
    this.IP = IP;
    this.technologyEquipmentType = "Army Computer";
    }

    @Override
    public String equipmentType() {
        return "Army Computer";
    }
}
