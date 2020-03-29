package summarizer.team;

import equipment.IEquipmentType;
import equipment.describer.EquipmentDescriber;
import team.ITeamMember;
import equipment.AbstractEquipment;
import summarizer.SummarizerUtils;

import java.util.List;
import java.util.Map;

public class ExtendedTeamEquipmentSummarizer implements ITeamEquipmentSummarizer {

    @Override
    public TeamSummarizerType getSummaryType() {
        return TeamSummarizerType.ExtendedTeamEquipmentSummarizer;
    }

    @Override
    public String getTeamEquipmentSummary(Map<ITeamMember, List<AbstractEquipment>> teamEquipments) {
        StringBuilder teamEquipmentSummary = new StringBuilder();
        EquipmentDescriber equipmentDescriber = new EquipmentDescriber();
        SummarizerUtils summarizerUtils = new SummarizerUtils();

        for (ITeamMember teamMember: teamEquipments.keySet()) {
            teamEquipmentSummary.append(teamMember.getName()).append(" from team ").append(teamMember.getTeamName());
            teamEquipmentSummary.append(" extended equipment summary:");
            teamEquipmentSummary.append(System.lineSeparator());

            teamEquipmentSummary.append(equipmentDescriber.getEquipmentsDescription(teamMember.getEquipments()));
            teamEquipmentSummary.append(System.lineSeparator());

            Map<IEquipmentType, Integer> countEquipmentTypesAppearances = summarizerUtils.CountEquipmentTypesAppearances(teamEquipments.get(teamMember));
            for (IEquipmentType equipment: countEquipmentTypesAppearances.keySet()) {
                teamEquipmentSummary.append(equipment).append(": ").append(countEquipmentTypesAppearances.get(equipment));
                teamEquipmentSummary.append(System.lineSeparator());
            }
            teamEquipmentSummary.append(System.lineSeparator());
        }
        return teamEquipmentSummary.toString().trim();
    }


}
