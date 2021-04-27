/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.miprimerprograma;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author xavier.verges
 */
public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void testSum() {
        assertEquals(2, calculadora.suma(1, 1));
    }

    @Test
    void testSumaFloat() {
        assertEquals(5.50, calculadora.suma(2.10f, 3.40f));
    }

    @Test
    void testSumaBigDecimal() {
        BigDecimal resultado = new BigDecimal("2.94");
        resultado.setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(resultado, calculadora.suma(new BigDecimal("1.505"),
                new BigDecimal("1.440")));
    }

}
