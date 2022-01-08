package com.basry.queryside.services;

import org.axonframework.eventsourcing.eventstore.DomainEventStream;


public interface EventSourcingService {
    DomainEventStream eventsByAccountId(String accountId);
}
