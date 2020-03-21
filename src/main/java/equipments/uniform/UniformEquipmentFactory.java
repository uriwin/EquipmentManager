package equipments.uniform;

import equipments.Equipment;

public class UniformEquipmentFactory {
    public UniformEquipment getUniformEquipment(String uniformEquipmentType, int size) {

        if (uniformEquipmentType.equalsIgnoreCase("Harmonit"))
            return new Harmonit(size);
        else if (uniformEquipmentType.equalsIgnoreCase("Coat A"))
            return new CoatA(size);
        return null;
    }
}
