package com.org.exception;

/**
 * 秒杀相关业务异常
 * Created by Administrator on 2016/8/25.
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
