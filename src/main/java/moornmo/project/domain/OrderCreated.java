package moornmo.project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moornmo.project.domain.*;
import moornmo.project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCreated extends AbstractEvent {

    private String orderId;
    private String customerId;
    private Money totalAmount;
    private Address shippingAddress;

    public OrderCreated(Order aggregate) {
        super(aggregate);
    }

    public OrderCreated() {
        super();
    }
}
//>>> DDD / Domain Event
