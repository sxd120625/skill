package com.org.exception;

/**
 * 重复秒杀异常(运行期异常)
 * Created by Administrator on 2016/8/25.
 */
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
