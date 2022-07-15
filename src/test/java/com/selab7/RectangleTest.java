package com.selab7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.selab7.exceptions.InvalidSizeForCalculateAreaException;
import com.selab7.shapes.Rectangle;

public class RectangleTest {
    @Test
    public void testCalculateAreaWithValidSize() {
        Rectangle rectangle = new Rectangle(11, 12);
        double area = rectangle.calculateArea();
        assertEquals(area, 11 * 12, 0.00001);
    }

    @Test
    public void testCalculateAreaWithInvalidSize() {
        // Invalid Width
        boolean exception = false;
        try {
            new Rectangle(-11, 12);
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);

        // Invalid Height
        exception = false;
        try {
            new Rectangle(11, -12);
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);

        // Invalid Width and Height
        exception = false;
        try {
            new Rectangle(-11, -12);
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);
    }

    @Test
    public void testCalculateAreaWithValidSizeChanging() {
        Rectangle rectangle = new Rectangle(11, 12);
        rectangle.setWidth(7);
        rectangle.setHeight(9);
        double area = rectangle.calculateArea();
        assertEquals(area, 7 * 9, 0.00001);
    }

    @Test
    public void testCalculateAreaWithInvalidSizeChanging() {
        boolean exception = false;
        Rectangle rectangle = new Rectangle(11, 12);

        // Invalid Width
        try {
            rectangle.setWidth(-11);
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);

        exception = false;
        try {
            rectangle.setWidth(15);
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);

        // Invalid Height
        try {
            rectangle.setHeight(-12);
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);

        exception = false;
        try {
            rectangle.setHeight(9);
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);
    }
}
