package com.github.devmix.sample.spring.cloud.services.app.api.events;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

/**
 * @author Sergey Grachev
 */
public class BusEvent extends RemoteApplicationEvent {

    private static final long serialVersionUID = 3051344948434122784L;

    private String payload;

    public BusEvent() {
    }

    public BusEvent(final Object source, final String originService, final String destinationService) {
        super(source, originService, destinationService);
    }

    public BusEvent(final Object source, final String originService) {
        super(source, originService);
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(final String payload) {
        this.payload = payload;
    }
}
