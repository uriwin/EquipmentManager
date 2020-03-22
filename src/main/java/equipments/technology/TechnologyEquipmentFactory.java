package equipments.technology;

public class TechnologyEquipmentFactory {
    public TechnologyEquipment getTechnologyEquipment(String technologyEquipmentType, String IP) {

        switch (technologyEquipmentType) {
            case "Voip":
                return new Voip(IP);
            case "Internet computer":
                return new InternetComputer(IP);
            case "Army computer":
                return new ArmyComputer(IP);
        }
        return null;
    }
}
