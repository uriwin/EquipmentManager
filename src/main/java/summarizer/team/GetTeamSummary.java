package summarizer.team;

import team.ITeamMember;
import equipment.AbstractEquipment;

import java.util.List;
import java.util.Map;

public class GetTeamSummary {
    public String getTeamSummary(TeamSummarizerType teamSummarizerType, Map<ITeamMember, List<AbstractEquipment>> teamEquipments){
        switch (teamSummarizerType){
            case NormalTeamEquipmentSummarizer:
                return new NormalTeamEquipmentSummarizer().getTeamSummary(teamEquipments);
            case ShortTeamEquipmentSummarizer:
                return new ShortTeamEquipmentSummarizer().getTeamSummary(teamEquipments);
            default:
                System.out.println("The summarizer type: " + teamSummarizerType.toString() + " does not exists");
        }
        throw new IllegalArgumentException("Invalid Equipment type");
    }
}
