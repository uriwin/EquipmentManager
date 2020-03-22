package equipments.uniform;

public class UniformEquipmentFactory {
    public UniformEquipment getUniformEquipment(String uniformEquipmentType, int size) {
        switch (uniformEquipmentType){
            case "Harmonit":
                return new Hermonit(size);
            case "Coat A":
                return new CoatA(size);
        }
        return null;
    }
}
