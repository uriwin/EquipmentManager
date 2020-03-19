package equipments.uniform;

import equipments.Equipment;

public class CoatA extends UniformEquipment {
    public CoatA(String size){
        this.size = size;
    }

    @Override
    public String equipmentType() {
        return "Coat A";
    }
}
