package equipment.technology;

public class InternetComputer extends AbstractTechnologyEquipment {
    public InternetComputer(String IP) {
        super(IP);
        this.equipmentType = TechnologyEquipmentType.InternetComputer;
    }

}
