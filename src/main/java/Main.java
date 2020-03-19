import Team.TeamLeader;
import Team.TeamMember;
import equipments.technology.*;
import equipments.uniform.UniformEquipment;
import equipments.uniform.UniformEquipmentFactory;

public class Main {
    public static void main(String[] args) {
        TechnologyEquipmentFactory technologyEquipmentFactory = new TechnologyEquipmentFactory();
        UniformEquipmentFactory uniformEquipmentFactory = new UniformEquipmentFactory();

        TechnologyEquipment urisInternetComputer = technologyEquipmentFactory.getTechnologyEquipment("Internet computer", " 127.0 .0 .1 ");
        TechnologyEquipment urisVoip = technologyEquipmentFactory.getTechnologyEquipment("Voip", "127.0.0.2");
        UniformEquipment urisHarmonit = uniformEquipmentFactory.getUniformEquipment("Harmonit", "large");
        TechnologyEquipment eliorInternetComputer = technologyEquipmentFactory.getTechnologyEquipment("Internet computer", "127.0.0.3");
        UniformEquipment noamCoatA = uniformEquipmentFactory.getUniformEquipment("Coat A", "medium");

        TeamMember noam = new TeamMember("Noam", "Sierra");
        TeamMember uri = new TeamMember("Uri", "Sierra");
        TeamLeader elior = new TeamLeader("Elior", "Sierra");
        elior.addTeamMember(uri);
        elior.addTeamMember(noam);

        elior.addTechnologyEquipment(eliorInternetComputer);
        uri.addUniformEquipment(urisHarmonit);
        uri.addTechnologyEquipment(urisVoip);
        uri.addTechnologyEquipment(urisInternetComputer);
        uri.addUniformEquipment(urisHarmonit);
        noam.addUniformEquipment(noamCoatA);

        elior.printAllTeamEquipment();

    }
}
