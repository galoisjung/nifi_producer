package org.tarbuck.nifi.shared.component;


import org.apache.nifi.components.PropertyDescriptor;
import org.apache.nifi.components.resource.ResourceCardinality;
import org.apache.nifi.components.resource.ResourceType;
import org.apache.nifi.expression.ExpressionLanguageScope;
import org.apache.nifi.processor.util.StandardValidators;


public interface KafkaClientComponent {

    PropertyDescriptor BOOTSTRAP_SERVERS = new PropertyDescriptor.Builder()
            .name("bootstrap.servers")
            .displayName("Kafka Brokers")
            .description("Comma-separated list of Kafka Brokers in the format host:port")
            .required(true)
            .addValidator(StandardValidators.HOSTNAME_PORT_LIST_VALIDATOR)
            .expressionLanguageSupported(ExpressionLanguageScope.VARIABLE_REGISTRY)
            .defaultValue("localhost:9092")
            .build();

}
