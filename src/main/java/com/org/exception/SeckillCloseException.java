package com.org.exception;

/**
 * 秒杀关闭异常
 * Created by Administrator on 2016/8/25.
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
