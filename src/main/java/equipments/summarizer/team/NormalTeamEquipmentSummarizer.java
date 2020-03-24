package equipments.summarizer.team;

import Team.ITeamMember;
import equipments.AbstractEquipment;
import equipments.EquipmentType;
import equipments.summarizer.SummarizerUtils;

import java.util.List;
import java.util.Map;

public class NormalTeamEquipmentSummarizer implements ITeamEquipmentSummarizer {

    @Override
    public TeamSummarizerType getSummaryType() {
        return TeamSummarizerType.NormalTeamEquipmentSummary;
    }

    @Override
    public String getTeamSummary(Map<ITeamMember, List<AbstractEquipment>> teamEquipments) {
        StringBuilder teamEquipmentSummarizer = new StringBuilder();
        SummarizerUtils summarizerUtils = new SummarizerUtils();
        for (ITeamMember teamMember: teamEquipments.keySet()) {
            teamEquipmentSummarizer.append(teamMember.getName()).append(" from team ").append(teamMember.getTeamName())
                    .append(" equipment summary:").append(System.lineSeparator());

            Map<EquipmentType, Integer> countEquipmentTypesAppearances = summarizerUtils.CountEquipmentTypesAppearances(teamEquipments.get(teamMember));
            for (EquipmentType equipment: countEquipmentTypesAppearances.keySet()) {
                teamEquipmentSummarizer.append(equipment).append(": ")
                        .append(countEquipmentTypesAppearances.get(equipment)).append(System.lineSeparator());
            }
        }
        return teamEquipmentSummarizer.toString().trim();
    }


}
