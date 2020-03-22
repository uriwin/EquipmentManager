import Team.TeamLeader;
import Team.TeamMember;
import equipments.technology.*;
import equipments.uniform.UniformEquipment;
import equipments.uniform.UniformEquipmentFactory;
import equipments.uniform.UniformEquipmentTypes;

public class Main {
    public static void main(String[] args) {
        TechnologyEquipmentFactory technologyEquipmentFactory = new TechnologyEquipmentFactory();
        UniformEquipmentFactory uniformEquipmentFactory = new UniformEquipmentFactory();

        TechnologyEquipment urisInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentTypes.VOIP, "192.6.6.6");
        TechnologyEquipment eliorInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentTypes.InternetComputer, "192.6.66.7");
        TechnologyEquipment noamInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentTypes.InternetComputer, "192.7.6.5");
        UniformEquipment noamCoatA = uniformEquipmentFactory.getUniformEquipment(UniformEquipmentTypes.CoatA, 42);

        TeamMember uri = new TeamMember("Uri", "Sierra");
        TeamLeader elior = new TeamLeader("Elior", "Sierra");
        elior.addTeamMember(uri);

        elior.addEquipment(eliorInternetComputer);
        uri.addEquipment(urisInternetComputer);
        uri.addEquipment(noamInternetComputer);
        uri.addEquipment(noamCoatA);
        elior.printAllTeamEquipment();

    }
}
