package equipments.uniform;

import equipments.Equipment;

public abstract class UniformEquipment implements Equipment {
    public int size;
    public String uniformEquipmentType;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getEquipmentDetails() {
        return "Uniform equipment type: " + this.uniformEquipmentType + ", size: " + this.size;
    }
}
