import Team.TeamLeader;
import Team.TeamMember;
import equipments.technology.*;
import equipments.uniform.UniformEquipment;
import equipments.uniform.UniformEquipmentFactory;

public class Main {
    public static void main(String[] args) {
        TechnologyEquipmentFactory technologyEquipmentFactory = new TechnologyEquipmentFactory();
        UniformEquipmentFactory uniformEquipmentFactory = new UniformEquipmentFactory();

        TechnologyEquipment urisInternetComputer = technologyEquipmentFactory.getTechnologyEquipment("Internet computer", "192.6.6.6");
        TechnologyEquipment eliorInternetComputer = technologyEquipmentFactory.getTechnologyEquipment("Internet computer", "192.6.66.7");
        TechnologyEquipment noamInternetComputer = technologyEquipmentFactory.getTechnologyEquipment("Internet computer", "192.7.6.5");
        UniformEquipment noamCoatA = uniformEquipmentFactory.getUniformEquipment("Coat A", 42);

        TeamMember uri = new TeamMember("Uri", "Sierra");
        TeamLeader elior = new TeamLeader("Elior", "Sierra");
        elior.addTeamMember(uri);

        elior.addTechnologyEquipment(eliorInternetComputer);
        uri.addTechnologyEquipment(urisInternetComputer);
        uri.addTechnologyEquipment(noamInternetComputer);
        uri.addUniformEquipment(noamCoatA);

        elior.printAllTeamEquipment();

    }
}
