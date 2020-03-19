package equipments.uniform;

import equipments.Equipment;

public abstract class UniformEquipment implements Equipment {
    public String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
