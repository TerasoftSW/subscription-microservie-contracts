package com.terasoft.subscriptionsbccontracts.events;


import com.terasoft.common.domain.enums.Currency;
import lombok.Value;

import java.time.Instant;

@Value
public class SubscriptionRegistered {
    private String subscriptionId;
    private Float amount;
    private Currency currency;
    private String description;
    private String lawyerId;
    private Instant occurredOn;
}
