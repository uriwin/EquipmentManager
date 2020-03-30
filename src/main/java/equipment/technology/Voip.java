package equipment.technology;

public class Voip extends AbstractTechnologyEquipment {

    public Voip(String IP) {
        super(IP);
        this.equipmentType = TechnologyEquipmentType.VOIP;
    }

}
