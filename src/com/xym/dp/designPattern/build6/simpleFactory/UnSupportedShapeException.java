package com.xym.dp.designPattern.build6.simpleFactory;

/**
 * desc
 *
 * @author xym
 */
public class UnSupportedShapeException extends RuntimeException {

    public UnSupportedShapeException() {
    }

    public UnSupportedShapeException(String message) {
        super(message);
    }

    public UnSupportedShapeException(String message, Throwable cause) {
        super(message, cause);
    }
}