package equipments.technology;

public class ArmyComputer extends TechnologyEquipment {
    public ArmyComputer(String IP){
    this.IP = IP;
    }

    @Override
    public String equipmentType() {
        return "Army Computer";
    }
}
