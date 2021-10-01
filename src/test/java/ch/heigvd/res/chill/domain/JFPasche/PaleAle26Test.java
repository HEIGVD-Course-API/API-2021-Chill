package ch.heigvd.res.chill.domain.JFPasche;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaleAle26Test {
    @Test
    void thePriceAndNameForPaleAle26ShouldBeCorrect() {
        PaleAle26 beer = new PaleAle26();
        assertEquals(beer.getName(), PaleAle26.NAME);
        assertEquals(beer.getPrice(), PaleAle26.PRICE);
    }
}