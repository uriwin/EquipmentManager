package equipments.uniform;

public class UniformEquipmentFactory {
    public UniformEquipment getUniformEquipment(UniformEquipmentTypes uniformEquipmentType, int size) {
        switch (uniformEquipmentType){
            case Hermonit:
                return new Hermonit(size);
            case CoatA:
                return new CoatA(size);
        }
        return null;
    }
}
