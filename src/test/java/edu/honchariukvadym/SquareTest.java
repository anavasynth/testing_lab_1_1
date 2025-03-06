package edu.honchariukvadym;

import org.junit.Test;

import static org.junit.Assert.*;

/*
  @author  Anavasynth
  @project  IntelliJ IDEA
  @class  SquareTest
  version 1.0.0
  @since 06.03.2025 - 16.03
*/

public class SquareTest {

    @Test
    public void testCalculateArea() {
        Square square = new Square(5);
        assertEquals(25, square.calculateArea(), 0.0001);
    }

    @Test
    public void testCalculatePerimeter() {
        Square square = new Square(4);
        assertEquals(16, square.calculatePerimeter(), 0.0001);
    }

    @Test
    public void testSetSide() {
        Square square = new Square(3);
        square.setSide(6);
        assertEquals(6, square.getSide(), 0.0001);
    }

    @Test
    public void testIsBiggerThan() {
        Square square1 = new Square(5);
        Square square2 = new Square(4);
        assertTrue(square1.isBiggerThan(square2));
    }

    @Test
    public void testCalculateDiagonal() {
        Square square = new Square(3);
        assertEquals(3 * Math.sqrt(2), square.calculateDiagonal(), 0.0001);
    }
}