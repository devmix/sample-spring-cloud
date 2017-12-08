package com.github.devmix.sample.spring.cloud.services.app.service2.stream;

import com.github.devmix.sample.spring.cloud.services.app.api.stream.StreamMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

/**
 * @author Sergey Grachev
 */
@Service
@EnableBinding(Sink.class)
public class StreamConsumerService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @StreamListener(Sink.INPUT)
    public void consumer(final StreamMessage message) {
        logger.info("Message: {} : {}", message.getClass().getSimpleName(), message.getPayload());
    }

}
