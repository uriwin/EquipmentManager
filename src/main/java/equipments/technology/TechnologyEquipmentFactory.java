package equipments.technology;

public class TechnologyEquipmentFactory {
    public TechnologyEquipment getTechnologyEquipment(String technologyEquipmentType, String IP){
        if(technologyEquipmentType.equalsIgnoreCase("Voip"))
            return new Voip(IP);
        else if (technologyEquipmentType.equalsIgnoreCase("Internet computer"))
            return new InternetComputer(IP);
        else if (technologyEquipmentType.equalsIgnoreCase("Army computer"))
            return new ArmyComputer(IP);
        return null;
    }
}
