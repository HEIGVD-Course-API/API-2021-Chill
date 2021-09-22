package ch.heigvd.res.chill.domain.PrazTobie;

import ch.heigvd.res.chill.protocol.OrderRequest;

public class DomainOrderRequest extends OrderRequest {
    private final static String DOMAIN =  "ch.heigvd.res.chill.domain";

    public DomainOrderRequest(int quantity, String productName) {
        super(quantity, DOMAIN + "." + productName);
    }
}
