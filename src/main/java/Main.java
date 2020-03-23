import Team.TeamLeader;
import Team.TeamMember;
import equipments.technology.*;
import equipments.uniform.AbstractUniformEquipment;
import equipments.uniform.CoatA;
import equipments.uniform.UniformEquipmentFactory;
import equipments.uniform.UniformEquipmentTypes;

public class Main {
    public static void main(String[] args) {
        TechnologyEquipmentFactory technologyEquipmentFactory = new TechnologyEquipmentFactory();
        UniformEquipmentFactory uniformEquipmentFactory = new UniformEquipmentFactory();

        Voip urisVoip = (Voip) technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentTypes.VOIP, "192.6.6.6");
        InternetComputer eliorInternetComputer = (InternetComputer) technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentTypes.InternetComputer, "192.6.66.7");
        InternetComputer urisInternetComputer = (InternetComputer) technologyEquipmentFactory.getTechnologyEquipment(TechnologyEquipmentTypes.InternetComputer, "192.7.6.5");
        CoatA urisCoatA = (CoatA) uniformEquipmentFactory.getUniformEquipment(UniformEquipmentTypes.CoatA, 42);

        TeamMember uri = new TeamMember("Uri", "Sierra");
        TeamLeader elior = new TeamLeader("Elior", "Sierra");
        elior.addTeamMember(uri);

        elior.addEquipment(eliorInternetComputer);
        uri.addEquipment(urisVoip);
        uri.addEquipment(urisInternetComputer);
        uri.addEquipment(urisCoatA);
        System.out.println(elior.getTeamEquipmentStatus());

    }
}
