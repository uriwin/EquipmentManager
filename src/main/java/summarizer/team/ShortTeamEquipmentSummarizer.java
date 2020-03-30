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
    public String getTeamEquipmentSummary(List<ITeamMember> teamMembers) {
        StringBuilder teamEquipmentSummarizer = new StringBuilder();
        SummarizerUtils summarizerUtils = new SummarizerUtils();
        for (ITeamMember teamMember : teamMembers) {
            teamEquipmentSummarizer.append(teamMember.getName())
                    .append(" equipment:")
                    .append(System.lineSeparator());

            Map<IEquipmentType, Integer> countEquipmentTypesAppearances = summarizerUtils.CountEquipmentTypesAppearances(teamMember.getEquipments());
            for (IEquipmentType equipment : countEquipmentTypesAppearances.keySet()) {
                teamEquipmentSummarizer.append(equipment).append(": ")
                        .append(countEquipmentTypesAppearances.get(equipment))
                        .append(System.lineSeparator());
            }
        }
        return teamEquipmentSummarizer.toString().trim();
    }
}
