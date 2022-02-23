package ch.heigvd.api.chill.domain.nigelmann;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class CoffeeGoutte implements IProduct {

    public final static String NAME = "Coffe goute";
    public final static BigDecimal PRICE = new BigDecimal(2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
