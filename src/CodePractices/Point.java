package CodePractices;

/*
You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.

Write the following methods (instance methods):

Method named getX without any parameters, it needs to return the value of x field.

Method named getY without any parameters, it needs to return the value of y field.

Method named setX with one parameter of type int, it needs to set the value of the x field.

Method named setY with one parameter of type int, it needs to set the value of the y field.

Method named distance without any parameters, it needs to return the distance between this Point and Point (0, 0) as a double.

Method named distance with parameter of type Point, it needs to return the distance between this Point and the parameter Point as a double.

Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x, y as a double.

How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

Where √ represents square root.
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public Point() {
        this(0, 0);
    }

    public double distance() {
        return this.distance(0, 0);
    }

    public double distance(Point point) {
        return this.distance(point.getX(), point.getY());
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = Math.max(x, 0);
    }

    public void setY(int y) {
        this.y = Math.max(y, 0);
    }
}
