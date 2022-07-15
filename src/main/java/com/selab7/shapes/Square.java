package com.selab7.shapes;

import com.selab7.exceptions.InvalidSizeForCalculateAreaException;

public class Square implements Shape {
    private double size;

    public Square(double size) {
        setSize(size);
    }

    public void setSize(double size) {
        if (size > 0) {
            this.size = size;
        } else {
            throw new InvalidSizeForCalculateAreaException(size, size);
        }
    }

    public double calculateArea() {
        return this.size * this.size;
    }
}
