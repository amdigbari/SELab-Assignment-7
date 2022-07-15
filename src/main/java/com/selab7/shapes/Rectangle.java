package com.selab7.shapes;

import com.selab7.exceptions.InvalidSizeForCalculateAreaException;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double first_dimension_size, double second_dimension_size) {
        if (first_dimension_size > 0 && second_dimension_size > 0) {
            this.width = Math.min(first_dimension_size, second_dimension_size);
            this.height = Math.max(first_dimension_size, second_dimension_size);
        } else {
            throw new InvalidSizeForCalculateAreaException(first_dimension_size, second_dimension_size);
        }
    }

    public void setWidth(double width) {
        if (width > 0 && width <= this.height) {
            this.width = width;
        } else {
            throw new InvalidSizeForCalculateAreaException(width, this.height);
        }
    }

    public void setHeight(double height) {
        if (height > 0 && height >= this.width) {
            this.height = height;
        } else {
            throw new InvalidSizeForCalculateAreaException(this.width, height);
        }
    }

    public double calculateArea() {
        return this.width * this.height;
    }
}
