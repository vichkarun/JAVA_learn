package task_03;

public class StorageOfInformation {

//    private final String type;
    private final int volumeOfMemory;
    private final double weight;
    private final StorageOfInformationType type;


    public StorageOfInformation(StorageOfInformationType type, int volumeOfMemory, double weight) {
        this.type = type;
        this.volumeOfMemory = volumeOfMemory;
        this.weight = weight;
    }

    public StorageOfInformationType getType() {
        return type;
    }

    public int getVolumeOfMemory() {
        return volumeOfMemory;
    }

    public double getWeight() {
        return weight;
    }

    public StorageOfInformation setType(StorageOfInformationType type) {
        return new StorageOfInformation(type, volumeOfMemory, weight);
    }
    public StorageOfInformation setVolumeOfMemory(int volumeOfMemory) {
        return new StorageOfInformation(type, volumeOfMemory, weight);
    }
    public StorageOfInformation setWeight(double weight) {
        return new StorageOfInformation(type, volumeOfMemory, weight);
    }

    public String toString() {
        return "Накопитель информации:" + "\n" +  "тип: " + type + ", объем памяти:  " + volumeOfMemory + " ГБ " + ", вес: " + weight + " гр.";
    }




}
