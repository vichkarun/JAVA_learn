package task_01;


public class GeometryCalculator {

    public static double radius;
    public double a;
    public double b;
    public double c;
    public static double p;

    public static double getCircleArea(double radius) {
        if (radius > 0) {
            return Math.PI * Math.pow(radius, 2);
        }  else return -1;
    }

    public static boolean trianglePossible(double a, double b, double c) {
        if (((a + b) >= c && (a + c) >= b && (c + b) >= a) && a >= 0 && b >= 0 && c >= 0) {
            return true;
        }
            else return false;
    }

    public static double getTriangleArea(double a, double b, double c) {
        if ((trianglePossible(a, b, c) == true) && ((p - a) != 0 && (p - b) != 0 && (p - c) != 0)) {
            double p = (a + b + c) / 2;
            return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        } else
        return -1;
    }


    public static double getSphereVolume(double radius){
         if (radius > 0) {
            return 4/3 * Math.PI * Math.pow(radius, 3);
        }
        else return -1;
    }
}

