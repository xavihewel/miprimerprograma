/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.empleados;

/**
 *
 * @author xavier.verges
 */
public class Empleados {

    private Empleado[] empleados;
    private int numeroEmpleados;

    public Empleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
        empleados = new Empleado[this.numeroEmpleados];
    }

    public void addEmpleado(Empleado empleado, int posicion) {
        this.empleados[posicion] = empleado;
    }

    public float calcularSueldoTotal() {
        float totalSueldo = 0;
        for (Empleado empleado : this.empleados) {
            totalSueldo += empleado.getSueldo();
        }
        return totalSueldo;
    }

}
