package com.github.devmix.sample.spring.cloud.services.app.api.stream;

import java.io.Serializable;

/**
 * @author Sergey Grachev
 */
public class StreamMessage implements Serializable {

    private static final long serialVersionUID = 5085079481847164349L;

    private String payload;

    public StreamMessage(final String payload) {
        this.payload = payload;
    }

    public StreamMessage() {
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(final String payload) {
        this.payload = payload;
    }
}
