package equipments.uniform;

import equipments.Equipment;

public class Harmonit extends UniformEquipment {
    public Harmonit(String size){
        this.size = size;
    }

    @Override
    public String equipmentType() {
        return "Harmonit";
    }
}
