/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.empleados;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author xavier.verges
 */
public class EmpleadosTest {

    @Test
    void testCalcularSueldoTotal() {
        int numeroEmpleados = 5;
        float sueldoUnitario = 2.5f;
        Empleados plantilla = new Empleados(numeroEmpleados);
        for (int i = 0; i < numeroEmpleados; i++) {
            plantilla.addEmpleado(new Empleado("nombre" + i, "apellidos" + i, sueldoUnitario), i);
        }
        float resultadoEsperado = 12.5f;
        assertEquals(resultadoEsperado, plantilla.calcularSueldoTotal());
    }
}
