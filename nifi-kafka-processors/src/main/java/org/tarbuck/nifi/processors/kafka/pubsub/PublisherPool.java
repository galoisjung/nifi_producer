package org.tarbuck.nifi.processors.kafka.pubsub;

import org.apache.nifi.logging.ComponentLog;

import java.util.concurrent.BlockingQueue;

public class PublisherPool implements Cloneable{
    private final ComponentLog logger;
    private final BlockingQueue<PublisherLease> publisherQueue;



}
