package edu.honchariukvadym;

/* 
  @author  Anavasynth
  @project  IntelliJ IDEA
  @class  Square
  version 1.0.0
  @since 06.03.2025 - 15.52
*/

public class Square {
    private double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        this.side = side;
    }

    public boolean isBiggerThan(Square other) {
        return this.calculateArea() > other.calculateArea();
    }

    public double calculateDiagonal() {
        return side * Math.sqrt(2);
    }
}
