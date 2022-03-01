package ch.heigvd.api.chill.domain.dgheig;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class FruitJuice implements IProduct {

    public final static String NAME = "Jus de fruit";
    public final static BigDecimal PRICE = new BigDecimal(4.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}