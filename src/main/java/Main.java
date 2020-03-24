import team.TeamLeader;
import team.TeamMember;
import equipments.EquipmentDescription;
import equipments.EquipmentType;
import summarizer.team.TeamSummarizerFactory;
import summarizer.team.TeamSummarizerType;
import equipments.technology.*;
import equipments.uniform.AbstractUniformEquipment;
import equipments.uniform.UniformEquipmentFactory;

public class Main {
    public static void main(String[] args) {
        TechnologyEquipmentFactory technologyEquipmentFactory = new TechnologyEquipmentFactory();
        UniformEquipmentFactory uniformEquipmentFactory = new UniformEquipmentFactory();
        TeamSummarizerFactory teamSummarizerFactory = new TeamSummarizerFactory();
        EquipmentDescription equipmentDescription = new EquipmentDescription();

        AbstractTechnologyEquipment eliorInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(EquipmentType.InternetComputer, "192.6.66.7");
        AbstractTechnologyEquipment urisInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(EquipmentType.InternetComputer, "192.7.6.5");
        AbstractTechnologyEquipment urisSecondInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(EquipmentType.InternetComputer, "192.6.6.6");
        AbstractUniformEquipment urisCoatA = uniformEquipmentFactory.getUniformEquipment(EquipmentType.CoatA, 42);

        TeamMember uri = new TeamMember("Uri", "Sierra");
        TeamLeader elior = new TeamLeader("Elior", "Sierra");
        elior.addTeamMember(uri);

        elior.addEquipment(eliorInternetComputer);
        uri.addEquipment(urisInternetComputer);
        uri.addEquipment(urisSecondInternetComputer);
        uri.addEquipment(urisCoatA);

        System.out.println(equipmentDescription.getTeamEquipmentDescription(elior.getTeamEquipments()) + System.lineSeparator());
        System.out.println(teamSummarizerFactory.getTeamSummary(TeamSummarizerType.NormalTeamEquipmentSummary,elior.getTeamEquipments()));

    }
}
