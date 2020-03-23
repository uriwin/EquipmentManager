package Team;

import equipments.IEquipment;

public interface ITeamMember {
    public void addEquipment(IEquipment equipment);
    public StringBuilder getMemberEquipmentSummary();
    public StringBuilder getMemberEquipmentDetails();
    public StringBuilder getMemberEquipmentDetailsAndSummary();
}
