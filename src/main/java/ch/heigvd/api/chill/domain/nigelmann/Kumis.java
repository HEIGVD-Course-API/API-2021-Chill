package ch.heigvd.api.chill.domain.nigelmann;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kumis implements IProduct {

    public final static String NAME = "Kumis";
    public final static BigDecimal PRICE = new BigDecimal(5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
