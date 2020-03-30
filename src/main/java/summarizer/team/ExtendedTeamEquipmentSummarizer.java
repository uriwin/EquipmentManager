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
    public String getTeamEquipmentSummary(List<ITeamMember> teamMembers) {
        StringBuilder teamEquipmentSummary = new StringBuilder();
        EquipmentDescriber equipmentDescriber = new EquipmentDescriber();
        SummarizerUtils summarizerUtils = new SummarizerUtils();

        for (ITeamMember teamMember: teamMembers) {
            teamEquipmentSummary.append(teamMember.getName())
                    .append(" from team ")
                    .append(teamMember.getTeamName())
                    .append(" extended equipment summary:")
                    .append(System.lineSeparator())
                    .append(equipmentDescriber.getEquipmentsDescription(teamMember.getEquipments()))
                    .append(System.lineSeparator());

            Map<IEquipmentType, Integer> countEquipmentTypesAppearances = summarizerUtils.CountEquipmentTypesAppearances(teamMember.getEquipments());
            for (IEquipmentType equipment: countEquipmentTypesAppearances.keySet()) {
                teamEquipmentSummary.append(equipment)
                        .append(": ")
                        .append(countEquipmentTypesAppearances.get(equipment))
                        .append(System.lineSeparator());
            }
            teamEquipmentSummary.append(System.lineSeparator());
        }
        return teamEquipmentSummary.toString().trim();
    }


}
