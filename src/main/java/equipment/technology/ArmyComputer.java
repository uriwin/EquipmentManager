package equipment.technology;

public class ArmyComputer extends AbstractTechnologyEquipment {
    public ArmyComputer(String IP) {
        super(IP);
        this.equipmentType = TechnologyEquipmentType.ArmyComputer;
    }
}
