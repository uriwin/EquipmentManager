package equipments.uniform;

import equipments.EquipmentType;

public class UniformEquipmentFactory {
    public AbstractUniformEquipment getUniformEquipment(EquipmentType uniformEquipmentType, int size) {
        switch (uniformEquipmentType){
            case Hermonit:
                return new Hermonit(size);
            case CoatA:
                return new CoatA(size);
        }
        return null;
    }
}
