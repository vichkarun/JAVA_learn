package task_01;

public class Elevator {

    public int currentFloor = 1;
    public int minFloor = 1;
    public int maxFloor = 26;

    public Elevator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public boolean moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;

        return false;
    }

    public boolean moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;

        return false;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void move(int floor) {

        if(floor > maxFloor || floor < minFloor) {
            System.out.println("Произошла ошибка :(");
        }
        else if(floor == currentFloor) {
            System.out.println("Указан текущий этаж");
        }
        else if(floor < currentFloor) {
            while (true) {
                moveDown();
                if (currentFloor != 0) {
                    System.out.println(currentFloor + " этаж");
                }
                if (floor == currentFloor) {
                    break;
                }
            }
        }
        else if (floor > currentFloor) {
            while (true) {
                moveUp();
                if (currentFloor != 0) {
                    System.out.println(currentFloor + " этаж");
                }
                if (floor == currentFloor) {
                    break;
                }
            }
        }
    }

}
