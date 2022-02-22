package ch.heigvd.api.chill.domain.dgheig;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class PepsiCola implements IProduct {

    public final static String NAME = "pepsi cola";
    public final static BigDecimal PRICE = new BigDecimal(3);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}