package task_03;

public class Computer {

    private Processor processor;
    private RAM RAM;
    private StorageOfInformation storageOfInformation;
    private Display display;
    private Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer(String name, String vendor, Processor processor, RAM RAM, StorageOfInformation storageOfInformation,
                    Display display, Keyboard keyboard) {
        this.name = name;
        this.vendor = vendor;
        this.processor = processor;
        this.RAM = RAM;
        this.storageOfInformation = storageOfInformation;
        this.display = display;
        this.keyboard = keyboard;
    }


    public String getName() {
        return name;
    }

    public Computer setName() {
        return new Computer(name, vendor, processor, RAM, storageOfInformation,
                display, keyboard);
    }

    public String getVendor() {
        return vendor;
    }

    public Computer setVendor() {
        return new Computer(name, vendor, processor, RAM, storageOfInformation,
                display, keyboard);
    }


    public Computer setProcessor(Processor processor) {
        return new Computer(name, vendor, processor, RAM, storageOfInformation,
                display, keyboard);
    }

    public Processor getProcessor() {
        return processor;
    }


    public RAM getRAM() {
        return RAM;
    }

    public Computer setRAM(RAM RAM) {
        return new Computer(name, vendor, processor, RAM, storageOfInformation,
                display, keyboard);
    }

    public StorageOfInformation getStorageOfInformation() {
        return storageOfInformation;
    }

    public Computer setStorageOfInformation(StorageOfInformation storageOfInformation) {
        return new Computer(name, vendor, processor, RAM, storageOfInformation,
                display, keyboard);
    }

    public Display getDisplay() {
        return display;
    }

    public Computer setDisplay(Display display) {
        return new Computer(name, vendor, processor, RAM, storageOfInformation,
                display, keyboard);
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(name, vendor, processor, RAM, storageOfInformation,
                display, keyboard);
    }

    public double sumWeight() {
        return processor.getWeight() + RAM.getWeight() + storageOfInformation.getWeight() + display.getWeight() + keyboard.getWeight();
    }

    public String toString() {
        return "Компьютер: " + "\n" + "\n" + processor.toString() + "\n" + RAM.toString() + "\n" +
                storageOfInformation.toString() + "\n" + display.toString() + "\n" + keyboard.toString();
    }
}


//    public String toString() {
//        return "Процессор: " + this.processor.getFrequency() + this.processor.getCores() + this.processor.getVendor()
//                + this.processor.getWeight() + "\n";




//    public Computer (int processor, int RAM, int storageOfInformation, int display, int keyboard) {
//        this.processor = processor;
//        this.RAM = RAM;
//        this.storageOfInformation = storageOfInformation;
//        this.display = display;
//        this.keyboard = keyboard;


//    public void setProcessor(int processor) {
//        this.processor = processor;
//    }
//
//    public void setRAM(int RAM) {
//        this.RAM = RAM;
//    }
//
//    public void setStorageOfInformation(int storageOfInformation) {
//        this.storageOfInformation = storageOfInformation;
//    }
//
//    public void setDisplay(int display) {
//        this.display = display;
//    }
//
//    public void setKeyboard(int keyboard) {
//        this.keyboard = keyboard;
//    }


