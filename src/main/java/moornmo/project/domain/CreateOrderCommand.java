package moornmo.project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateOrderCommand {

    private String orderId;
    private String customerId;
    private Money totalAmount;
    private Address shippingAddress;
}
