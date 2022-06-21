package com.dotmarketing.osgi.webinterceptors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RewriteBean {
    private final String source;
    private final String destination;

    @JsonCreator
    public RewriteBean(@JsonProperty("source") final String source,
                       @JsonProperty("destination") final String destination) {
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
}
