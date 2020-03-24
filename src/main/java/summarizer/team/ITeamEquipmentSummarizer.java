package summarizer.team;

import team.ITeamMember;
import equipment.AbstractEquipment;

import java.util.List;
import java.util.Map;

public interface ITeamEquipmentSummarizer {
    public TeamSummarizerType getSummaryType();
    public String getTeamSummary(Map<ITeamMember, List<AbstractEquipment>> teamEquipments);
}
