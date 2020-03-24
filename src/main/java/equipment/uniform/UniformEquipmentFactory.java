package equipment.uniform;

public class UniformEquipmentFactory {
    public AbstractUniformEquipment getUniformEquipment(UniformEquipmentType uniformEquipmentType, int size) {
        switch (uniformEquipmentType){
            case Hermonit:
                return new Hermonit(size);
            case CoatA:
                return new CoatA(size);
            default:
                System.out.println("The equipment type: " + uniformEquipmentType.toString() + " does not exists");
        }
        throw new IllegalArgumentException("Invalid Equipment type");
    }
}
