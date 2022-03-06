package com.testing.testing1;

import com.testing.testing1.task1.PowerSeriesExpansion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task1Test {

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/2, -Math.PI/3, -Math.PI/4,
            -Math.PI/6, 0, Math.PI/6, Math.PI/4,
            Math.PI/3, Math.PI/2})
    void rightHalfSinTest(Double value) {
        double expected = new BigDecimal(Double.toString(Math.sin(value)))
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
        assertEquals(expected, PowerSeriesExpansion.sinExpansion(value));
    }

    @ParameterizedTest
    @ValueSource(doubles = {4*Math.PI/6, 3*Math.PI/4,
            2*Math.PI/3, Math.PI, 7*Math.PI/6, 5*Math.PI/4, 5*Math.PI/3})
    void leftHalfSinTest(Double value) {
        double expected = new BigDecimal(Double.toString(Math.sin(value)))
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
        assertEquals(expected, PowerSeriesExpansion.sinExpansion(value));
    }

}
