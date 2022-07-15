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
}
