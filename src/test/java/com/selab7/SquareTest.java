package com.selab7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.selab7.exceptions.InvalidSizeForCalculateAreaException;
import com.selab7.shapes.Square;

public class SquareTest {
    @Test
    public void testCalculateAreaWithValidSize() {
        Square square = new Square(11);
        double area = square.calculateArea();
        assertEquals(area, 11 * 11, 0.00001);
    }

    @Test
    public void testCalculateAreaWithInvalidSize() {
        boolean exception = false;
        try {
            new Square(-11);
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);
    }

    @Test
    public void testCalculateAreaWithValidSizeChanging() {
        Square square = new Square(11);
        square.setSize(7);
        double area = square.calculateArea();
        assertEquals(area, 7 * 7, 0.00001);
    }

    @Test
    public void testCalculateAreaWithInvalidSizeChanging() {
        boolean exception = false;
        Square square = new Square(11);

        try {
            square.setSize(-11);
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);
    }
}
