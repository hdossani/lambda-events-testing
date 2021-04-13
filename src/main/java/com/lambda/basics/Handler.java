package com.lambda.basics;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
@Slf4j
public class Handler implements RequestHandler<Map<String, String>, String> {

    @Override
    public String handleRequest(Map<String, String> event, Context context) {
        log.info("### Event ### " + event.toString());
        return event.get("message").toUpperCase();
    }
}

