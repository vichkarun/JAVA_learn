package task_03;

public class SwimmingPool {
    public static void main(String[] args) {

        int volume = 1200;

        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int currentVolume = 0;
        int fillingTime = 0;

        while (currentVolume != volume) {
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            fillingTime++;
            System.out.println(currentVolume);
        }

        System.out.println("Время наполнения бассейна: " + fillingTime + " минут");

    }
}
