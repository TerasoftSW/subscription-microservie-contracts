package com.terasoft.subscriptionsbccontracts.commands;

import com.terasoft.common.domain.enums.Currency;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditSubscription {
    @TargetAggregateIdentifier
    private String subscriptionId;
    private Float amount;
    private Currency currency;
    private String description;
    private String lawyerId;
}
