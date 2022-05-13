package task_03;

public class Main {
    public static void main(String[] args) {

       Processor processor1 = new Processor(64,4,"Intel",50);
       RAM RAM1 = new RAM("DDR4",8,20);
       StorageOfInformation storageOfInformation1 = new StorageOfInformation(StorageOfInformationType.HDD,16,20);
       Display display1 = new Display(24.7,DisplayType.VA,5000);
       Keyboard keyboard1 = new Keyboard(KeyboardType.MECHANICAL,true,1220);

       Computer computer1 = new Computer("ASUS X550V","ASUS",processor1, RAM1,storageOfInformation1,display1,keyboard1);

        System.out.println(computer1);



    }
}
