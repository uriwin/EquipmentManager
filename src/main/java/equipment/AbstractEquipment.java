package equipment;

public abstract class AbstractEquipment {
    public IEquipmentType equipmentType;

    public IEquipmentType getEquipmentType() {
        return this.equipmentType;
    }

    public String getEquipmentDetails() {
        return "Equipment type: " + this.equipmentType.toString();
    };
}
