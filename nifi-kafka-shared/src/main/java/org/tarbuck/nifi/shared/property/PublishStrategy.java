package org.tarbuck.nifi.shared.property;

import org.apache.nifi.components.DescribedValue;

public enum PublishStrategy implements DescribedValue {

    USE_VALUE( "Use Content as Record Value", "Write only the FlowFile content to the Kafka Record value."),
    USE_WRAPPER("Use Wrapper", "Write the Kafka Record key, value, headers, and metadata into the Kafka Record value.  (See processor usage for more information.)");

    private final String displayName;

    private final String description;

    PublishStrategy(final String displayName, final String description){
        this.displayName = displayName;
        this.description = description;
    }


    @Override
    public String getValue() {
        return name();
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
