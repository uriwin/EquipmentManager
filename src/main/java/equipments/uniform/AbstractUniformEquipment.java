package equipments.uniform;

import equipments.AbstractEquipment;

public abstract class AbstractUniformEquipment extends AbstractEquipment {
    public int size;

    public AbstractUniformEquipment(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getEquipmentDetails() {
        return "Uniform equipment type: " + this.equipmentType + ", size: " + this.size;
    }
}
