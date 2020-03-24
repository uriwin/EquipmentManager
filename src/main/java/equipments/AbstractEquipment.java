package equipments;

public abstract class AbstractEquipment implements IEquipment {
    public EquipmentType equipmentType;

    public EquipmentType getEquipmentType() {
        return this.equipmentType;
    }
}
