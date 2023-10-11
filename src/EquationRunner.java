import java.util.Scanner;
public class EquationRunner
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        LinearEquation unknown = new LinearEquation(0, 0, 0, 0);
        System.out.print("First coordinate point: ");
        String coord1 = s.nextLine();
        int coord1x = unknown.xCoord(coord1);
        int coord1y = unknown.yCoord(coord1);
        System.out.print("Second coordinate point: ");
        String coord2 = s.nextLine();
        int coord2x = unknown.xCoord(coord2);
        int coord2y = unknown.yCoord(coord2);
        LinearEquation coordinates = new LinearEquation(coord1x, coord1y, coord2x, coord2y);
        double slope = coordinates.slope();
        double yIntercept = coordinates.yIntercept(slope);
        String linearEquation = coordinates.calculateLinearEquation(slope, yIntercept);
        System.out.println("Linear equation: " + linearEquation);
        System.out.println("Slope: " + slope);
        System.out.println("Y intercept: " + yIntercept);
        System.out.println("Distance between two points: " + coordinates.distanceBetweenTwoPoints());
        System.out.print("Third x-value: ");
        String xVal = s.nextLine();
        double xValue = Double.parseDouble(xVal);
        LinearEquation xCoordinate = new LinearEquation(xValue);
        double yValue = xCoordinate.yValue(slope, yIntercept);
        System.out.println("Solved coordinate point: (" + xValue + ", " + yValue + ")");
        s.close();
    }
}