package com.selab7.exceptions;

public class InvalidSizeForCalculateAreaException extends RuntimeException {
    public InvalidSizeForCalculateAreaException(double width, double height) {
        super("Invalid shape sizes for calculateArea: " + "width:" + width + ", height:" + height);
    }
}
