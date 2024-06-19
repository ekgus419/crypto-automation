package com.example.cryptoautomation.http;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import org.springframework.stereotype.Component;

@Component
public class SlackHttpClient {
    public void send(String message) {
        try {
            Slack instance = Slack.getInstance();
            Payload payload = Payload.builder()
                    .text(message)
                    .build();
            instance.send("https://hooks.slack.com/services/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", payload);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
