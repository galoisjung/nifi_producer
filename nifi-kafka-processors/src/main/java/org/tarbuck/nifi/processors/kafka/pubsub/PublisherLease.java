package org.tarbuck.nifi.processors.kafka.pubsub;

import org.apache.kafka.clients.producer.Producer;
import org.apache.nifi.logging.ComponentLog;
import org.apache.nifi.serialization.RecordSetWriterFactory;
import org.tarbuck.nifi.shared.property.PublishStrategy;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

public class PublisherLease implements Cloneable {

    private final ComponentLog logger;

    private final Producer<byte[], byte[]> producer;

    private final int maxMessageSize;

    private final long maxAckWaitMillis;

    private final boolean useTransactions;

    private final Pattern attributeNameRegex;

    private final Charset headerCharacterSet;

    private final PublishStrategy publishStrategy;

    private final RecordSetWriterFactory recordSetWriterFactory;

    private volatile boolean poisoned = false;

    public PublisherLease(final Producer<byte[], byte[]> producer, final int maxMessageSize, final long maxAckWaitMillis,
                          final ComponentLog logger, final boolean useTransactions, final Pattern attributeNameRegex,
                          final Charset headerCharacterSet, final PublishStrategy publicStrategy, final RecordSetWriterFactory recordSetWriterFactory) {
        this.producer = producer;
        this.maxMessageSize = maxMessageSize;
        this.logger = logger;
        this.maxAckWaitMillis = maxAckWaitMillis;
        this.useTransactions = useTransactions;
        this.attributeNameRegex = attributeNameRegex;
        this.headerCharacterSet = headerCharacterSet;
        this.publishStrategy = publicStrategy;
        this.recordSetWriterFactory = recordSetWriterFactory;
    }



}
