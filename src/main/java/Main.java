import Team.TeamLeader;
import Team.TeamMember;
import equipments.EquipmentSummary;
import equipments.technology.*;
import equipments.uniform.AbstractUniformEquipment;
import equipments.uniform.UniformEquipmentFactory;
import equipments.uniform.UniformEquipmentTypes;

public class Main {
    public static void main(String[] args) {
        TechnologyEquipmentFactory technologyEquipmentFactory = new TechnologyEquipmentFactory();
        UniformEquipmentFactory uniformEquipmentFactory = new UniformEquipmentFactory();
        EquipmentSummary equipmentSummary = new EquipmentSummary();

        AbstractTechnologyEquipment eliorInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentTypes.InternetComputer, "192.6.66.7");
        AbstractTechnologyEquipment urisInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentTypes.InternetComputer, "192.7.6.5");
        AbstractTechnologyEquipment urisSecondInternetComputer = technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentTypes.InternetComputer, "192.6.6.6");
        AbstractUniformEquipment urisCoatA = uniformEquipmentFactory.getUniformEquipment(UniformEquipmentTypes.CoatA, 42);

        TeamMember uri = new TeamMember("Uri", "Sierra");
        TeamLeader elior = new TeamLeader("Elior", "Sierra");
        elior.addTeamMember(uri);

        elior.addEquipment(eliorInternetComputer);
        uri.addEquipment(urisInternetComputer);
        uri.addEquipment(urisSecondInternetComputer);
        uri.addEquipment(urisCoatA);

        System.out.println(elior.getTeamEquipmentDetails() + System.lineSeparator());
        System.out.println(equipmentSummary.getTeamEquipmentSummary(elior.teamMembers));

    }
}
