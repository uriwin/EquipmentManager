package equipments.technology;

import equipments.EquipmentType;

public class TechnologyEquipmentFactory {


    public AbstractTechnologyEquipment getTechnologyEquipment(EquipmentType technologyEquipmentType, String IP) {
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
