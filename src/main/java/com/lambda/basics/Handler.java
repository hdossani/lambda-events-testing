package com.lambda.basics;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Map;

public class Handler implements RequestHandler<Map<String, String>, String> {

    @Override
    public String handleRequest(Map<String, String> event, Context context) {
        LambdaLogger logger = context.getLogger();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // process event
        logger.log("EVENT: " + gson.toJson(event));
        logger.log("Name From Event : " + event.get("name"));
        return gson.toJson(event);
    }
}

