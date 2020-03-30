import summarizer.team.ITeamEquipmentSummarizer;
import team.TeamLeader;
import team.TeamMember;
import equipment.uniform.UniformEquipmentType;
import summarizer.team.TeamSummarizerFactory;
import summarizer.team.TeamSummarizerType;
import equipment.technology.*;
import equipment.uniform.AbstractUniformEquipment;
import equipment.uniform.UniformEquipmentFactory;

public class Main {
    public static void main(String[] args) {
        TechnologyEquipmentFactory technologyEquipmentFactory = new TechnologyEquipmentFactory();
        UniformEquipmentFactory uniformEquipmentFactory = new UniformEquipmentFactory();
        TeamSummarizerFactory teamSummarizerFactory = new TeamSummarizerFactory();

        AbstractTechnologyEquipment eliorInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentType.InternetComputer, "192.6.66.7");
        AbstractTechnologyEquipment urisInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentType.InternetComputer, "192.7.6.5");
        AbstractTechnologyEquipment urisSecondInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentType.InternetComputer, "192.6.6.6");
        AbstractUniformEquipment urisCoatA = uniformEquipmentFactory.getUniformEquipment(UniformEquipmentType.CoatA, 42);

        TeamMember uri = new TeamMember("Uri", "Sierra");
        TeamLeader elior = new TeamLeader("Elior", "Sierra");
        elior.addTeamMember(uri);

        elior.addEquipment(eliorInternetComputer);
        uri.addEquipment(urisInternetComputer);
        uri.addEquipment(urisSecondInternetComputer);
        uri.addEquipment(urisCoatA);

        ITeamEquipmentSummarizer teamEquipmentSummarizer = teamSummarizerFactory.getTeamSummarizer(TeamSummarizerType.ExtendedTeamEquipmentSummarizer);
        System.out.println(teamEquipmentSummarizer.getTeamEquipmentSummary(elior.getTeamMembers()));

    }
}
