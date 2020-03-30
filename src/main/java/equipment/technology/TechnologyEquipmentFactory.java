package equipment.technology;

public class TechnologyEquipmentFactory {


    public AbstractTechnologyEquipment getTechnologyEquipment(TechnologyEquipmentType technologyEquipmentType, String IP) {
        switch (technologyEquipmentType) {
            case VOIP:
                return new Voip(IP);
            case InternetComputer:
                return new InternetComputer(IP);
            case ArmyComputer:
                return new ArmyComputer(IP);
            default:
                System.out.println("The equipment type: " + technologyEquipmentType.toString() + " does not exists");
                throw new IllegalArgumentException("Invalid Equipment type");
        }
    }

}
