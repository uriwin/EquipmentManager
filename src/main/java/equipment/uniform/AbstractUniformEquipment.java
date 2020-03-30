package equipment.uniform;

import equipment.AbstractEquipment;

public abstract class AbstractUniformEquipment extends AbstractEquipment {
    public int size;

    public AbstractUniformEquipment(int size) {
        this.setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getEquipmentDetails() {
        return "Uniform equipment type: " + this.equipmentType.toString() + ", size: " + this.getSize();
    }
}
