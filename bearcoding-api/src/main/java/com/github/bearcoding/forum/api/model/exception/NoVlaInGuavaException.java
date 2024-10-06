package com.github.bearcoding.forum.api.model.exception;

/**
 * 未命中异常
 *
 *
 *
 */
public class NoVlaInGuavaException extends RuntimeException {
    public NoVlaInGuavaException(String msg) {
        super(msg);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}