package com.testing.testing1.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Double.NaN;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PowerSeriesExpansionTest {

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/2, -Math.PI/3, -Math.PI/4,
            -Math.PI/6, 0, Math.PI/6, Math.PI/4, Math.PI/3, Math.PI/2})
    void rightHalfSinTest(Double value) {
        double expected = new BigDecimal(Double.toString(Math.sin(value)))
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
        Assertions.assertEquals(expected, PowerSeriesExpansion.sinExpansion(value));
    }

    @ParameterizedTest
    @ValueSource(doubles = {4*Math.PI/6, 3*Math.PI/4,
            2*Math.PI/3, Math.PI, 7*Math.PI/6, 5*Math.PI/4, 5*Math.PI/3})
    void leftHalfSinTest(Double value) {
        double expected = new BigDecimal(Double.toString(Math.sin(value)))
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
        Assertions.assertEquals(expected, PowerSeriesExpansion.sinExpansion(value));
    }

    @ParameterizedTest
    @ValueSource(doubles = {22, 32.7777, 4, 19, 0.15, 18, 1.3, 0.000001})
    void differentAnglesTest(Double value) {
        double expected = new BigDecimal(Double.toString(Math.sin(value)))
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
        Assertions.assertEquals(expected, PowerSeriesExpansion.sinExpansion(value));
    }

    @Test
    void nanArgTest() {
        boolean isNan = Double.isNaN(PowerSeriesExpansion.sinExpansion(NaN));
        Assertions.assertTrue(isNan);
    }

}
