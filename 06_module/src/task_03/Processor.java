package task_03;

public class Processor {


    private final double frequency;
    private final int cores;
    private final String vendor;
    private final double weight;

    public Processor(double frequency, int cores, String vendor, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.vendor = vendor;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getVendor() {
        return vendor;
    }

    public double getWeight() {
        return weight;
    }

    public Processor setFrequency(double frequency) {
        return new Processor(frequency, cores, vendor, weight);
    }
    public Processor setCores(int cores) {
        return new Processor(frequency, cores, vendor, weight);
    }
    public Processor setVendor(String vendor) {
        return new Processor(frequency, cores, vendor, weight);
    }
    public Processor setWeight(double weight) {
        return new Processor(frequency, cores, vendor, weight);
    }

    public String toString() {
        return "Процессор: " + "\n" +  "частота - " + frequency + ", количество ядер - " + cores + ", производитель - " + vendor +
                ", вес - " + weight + " гр.";
    }


}
