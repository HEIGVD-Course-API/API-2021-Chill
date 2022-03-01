package ch.heigvd.api.chill.domain.heigvdgachetje;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class GinTonic implements IProduct {

    public final static String NAME = "GinTonic";
    public final static BigDecimal PRICE = new BigDecimal(6);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
