package com.lambda.basics;


import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Lambda Tests")
public class HandlerTest {

    @Test
    public void handleRequest_shouldReturnMessage() {

        Handler function = new Handler();
        Gson gson = new Gson();
        Map inputEventMap = gson.fromJson("{\"author\": \"Jerome\", \"message\": \"Hello from Lambda!\"}", Map.class);
        String result = function.handleRequest(inputEventMap, new MockContext());
        assertNotNull(result);

    }
}
