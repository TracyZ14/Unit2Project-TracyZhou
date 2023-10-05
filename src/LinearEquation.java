public class LinearEquation
{
    private int xCoord1;
    private int yCoord1;
    private int xCoord2;
    private int yCoord2;

    public LinearEquation(int xCoord1, int yCoord1, int xCoord2, int yCoord2)
    {
        this.xCoord1 = xCoord1;
        this.yCoord1 = yCoord1;
        this.xCoord2 = xCoord2;
        this.yCoord2 = yCoord2;
    }

    public int xCoord(String x)
    {
        int openParenthesisIndex = x.indexOf("(");
        int commaIndex = x.indexOf(",");
        String xCoordinate = x.substring(openParenthesisIndex+1, commaIndex);
        int xCoord = Integer.parseInt(xCoordinate);
        return xCoord;
    }

    public int yCoord(String y)
    {
        int commaIndex = y.indexOf(",");
        int closeParenthesisIndex = y.indexOf(")");
        String yCoordinate = y.substring(commaIndex+1, closeParenthesisIndex);
        int yCoord = Integer.parseInt(yCoordinate);
        return yCoord;
    }

    public double slope()
    {
        double slope = ((double) yCoord2 - yCoord1) / (xCoord2 - xCoord1);
        return slope;
    }

    public double yIntercept(double slope)
    {
        double yIntercept = yCoord1 / ((double) xCoord1 * slope);
        return yIntercept;
    }

    public String calculateLinearEquation(double slope, double yIntercept)
    {
        String linearEquation = "y = " + slope + "x + " + yIntercept;
        return linearEquation;
    }

    public double distanceBetweenTwoPoints()
    {
        double slope = Math.sqrt(Math.pow(xCoord2 - xCoord1, 2) + Math.pow(yCoord2 - yCoord1, 2));
        return slope;
    }

    public double yValue(double slope, int xValue, double yIntercept)
    {
        double yValue = (slope * xValue) + yIntercept;
        return yValue;
    }
}