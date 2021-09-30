package ch.heigvd.res.chill.domain.clemdiep;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class Chouffe implements IProduct {

    public final static String NAME = "Duvel";
    public final static BigDecimal PRICE = new BigDecimal("4.5");

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
