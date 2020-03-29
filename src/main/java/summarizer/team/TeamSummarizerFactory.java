package summarizer.team;

import team.ITeamMember;
import equipment.AbstractEquipment;

import java.util.List;
import java.util.Map;

public class TeamSummarizerFactory {
    public ITeamEquipmentSummarizer getTeamSummarizer(TeamSummarizerType teamSummarizerType){
        switch (teamSummarizerType){
            case ExtendedTeamEquipmentSummarizer:
                return new ExtendedTeamEquipmentSummarizer();
            case ShortTeamEquipmentSummarizer:
                return new ShortTeamEquipmentSummarizer();
            default:
                System.out.println("The summarizer type: " + teamSummarizerType.toString() + " does not exists");
                throw new IllegalArgumentException("Invalid Equipment type");
        }
    }
}
