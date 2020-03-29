package summarizer.team;

import equipment.AbstractEquipment;
import equipment.IEquipmentType;
import equipment.uniform.UniformEquipmentType;
import summarizer.SummarizerUtils;
import team.ITeamMember;

import java.util.List;
import java.util.Map;

public class ShortTeamEquipmentSummarizer implements  ITeamEquipmentSummarizer{
    @Override
    public TeamSummarizerType getSummaryType() {
        return TeamSummarizerType.ShortTeamEquipmentSummarizer;
    }

    @Override
    public String getTeamEquipmentSummary(Map<ITeamMember, List<AbstractEquipment>> teamEquipments) {
        StringBuilder teamEquipmentSummarizer = new StringBuilder();
        SummarizerUtils summarizerUtils = new SummarizerUtils();
        for (ITeamMember teamMember : teamEquipments.keySet()) {
            teamEquipmentSummarizer.append(teamMember.getName()).append(" equipment:").append(System.lineSeparator());

            Map<IEquipmentType, Integer> countEquipmentTypesAppearances = summarizerUtils.CountEquipmentTypesAppearances(teamEquipments.get(teamMember));
            for (IEquipmentType equipment : countEquipmentTypesAppearances.keySet()) {
                teamEquipmentSummarizer.append(equipment).append(": ")
                        .append(countEquipmentTypesAppearances.get(equipment)).append(System.lineSeparator());
            }
        }
        return teamEquipmentSummarizer.toString().trim();
    }
}
