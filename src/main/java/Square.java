/**
 * Implements a class that encapsulates data and methods for representing a square
 * @author 
 * @version 1.0
 * @since 2024-09-
 */
import java.lang.Math;
class Square {
        /** The side length of the square **/
    private double side = 1.0;

        /** The perimeter of the square **/
    private double perimeter = 4.0;

        /** The area of the square **/
        // add an instance variable for area
    private double area = side*side;
    

    /**
     * Constructor
     * @param side double representing the side length. Assumes positive non-zero 
     */
        // add a constructor that takes a side length
    public Square(double s) {
        side = s;
        perimeter = s*4;
        area = s*s;
    }


    /**
     * Gets side length
     * @return double representing side
     */
    public double getSide() {
        return side;
    }

    /**
     * Gets perimeter
     * @return double representing perimeter
     */
    // implement getter for perimeter
    public double getPerimeter() {
        return perimeter;
    }

    /**
     * Gets area
     * @return double representing area
     */
    // implement getter for area
    public double getArea() {
        return area;
    }

    /**
     * Sets side length. Perimeter and area are updated
     * @param s double representing the new side length.
     */
    public void setSide(double s) {
        side = s;
        perimeter = 4 * side; // calculate perimeter
        //  calculate the area
        area = side * side;
    }

    /**
     * Sets area. Perimeter and side length are updated
     */
    // implement - you will need to import java.lang.Math to use sqrt() method
    public void setArea(double a) {
        area = a;
        side = Math.sqrt(area);
        perimeter = side*4;
    }

    /**
     * Sets perimeter. Area and side length are updated
     */
    // implement - you will need to import java.lang.Math to use sqrt() method
    public void setPerimeter(double p){
        perimeter = p;
        side = p/4;
        area = side * side;
    }

}