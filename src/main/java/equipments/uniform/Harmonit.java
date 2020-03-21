package equipments.uniform;

import equipments.Equipment;

public class Harmonit extends UniformEquipment {
    public Harmonit(int size){
        this.size = size;
        this.uniformEquipmentType = "Harmonit";
    }

    @Override
    public String equipmentType() {
        return this.uniformEquipmentType;
    }

}
