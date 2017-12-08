package com.github.devmix.sample.spring.cloud.services.app.service1.stream;

import com.github.devmix.sample.spring.cloud.services.app.api.stream.StreamMessage;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Sergey Grachev
 */
@Service
@EnableBinding(Source.class)
public class StreamProducerService {

    @Bean
    @InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "10000", maxMessagesPerPoll = "1"))
    public MessageSource<StreamMessage> producer() {
        return () -> MessageBuilder.withPayload(new StreamMessage(new Date().getTime() + "")).build();
    }
}
