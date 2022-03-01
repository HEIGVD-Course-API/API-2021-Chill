package ch.heigvd.api.chill.domain.yanickheig;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class Water implements IProduct {

    public final static String NAME = "Water";
    public final static BigDecimal PRICE = new BigDecimal(1.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}