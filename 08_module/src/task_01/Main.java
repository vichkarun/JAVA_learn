package task_01;

public class Main {
    public static void main(String[] args) {

        GeometryCalculator geometryCalculator = new GeometryCalculator();

        System.out.println(GeometryCalculator.getCircleArea(10));
        System.out.println(GeometryCalculator.getTriangleArea(3,4,2));
        System.out.println(GeometryCalculator.getSphereVolume(2));
        }

    }

