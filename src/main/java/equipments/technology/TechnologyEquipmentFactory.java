package equipments.technology;

public class TechnologyEquipmentFactory {


    public AbstractTechnologyEquipment getTechnologyEquipment(TechnologyEquipmentTypes technologyEquipmentType, String IP) {
        switch (technologyEquipmentType) {
            case VOIP:
                return new Voip(IP);
            case InternetComputer:
                return new InternetComputer(IP);
            case ArmyComputer:
                return new ArmyComputer(IP);
        }
        return null;
    }

}
