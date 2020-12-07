public class AreaCalculator {
    //method overflow

    //method to check area of circle
    public static double area (double radius){
        if(radius < 0){
            return -1.0;
        }
        double areaOfCircle = radius * radius * Math.PI;
        return areaOfCircle;
    }
    //method to check area of rectangle
    public static double area (double x , double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        double area = x * y;
        return area;
    }
}
