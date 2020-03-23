package equipments.uniform;

import equipments.IEquipment;

public abstract class AbstractUniformEquipment implements IEquipment {
    public int size;
    public String uniformEquipmentType;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getEquipmentType() {
        return this.uniformEquipmentType;
    }

    @Override
    public String getEquipmentDetails() {
        return "Uniform equipment type: " + this.uniformEquipmentType + ", size: " + this.size;
    }
}
