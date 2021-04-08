package com.lambda.basics;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestLogger implements LambdaLogger {

    @Override
    public void log(String s) {
        log.info(s);
    }

    @Override
    public void log(byte[] bytes) {
        log.info(String.valueOf(bytes));
    }
}
