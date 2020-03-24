package equipments.summarizer.team;

import Team.ITeamMember;
import equipments.AbstractEquipment;

import java.util.List;
import java.util.Map;

public class TeamSummarizerFactory {
    public String getTeamSummary(TeamSummarizerType teamSummarizerType, Map<ITeamMember, List<AbstractEquipment>> teamEquipments){
        switch (teamSummarizerType){
            case NormalTeamEquipmentSummary:
                return new NormalTeamEquipmentSummarizer().getTeamSummary(teamEquipments);
        }
        return null;
    }
}
