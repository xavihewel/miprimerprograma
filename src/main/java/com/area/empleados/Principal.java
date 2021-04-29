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
public class Principal {

    public static void main(String[] args) {

        //primera versión
        Empleado empleados[];
        empleados = new Empleado[5];

        empleados[0] = new Empleado("Pepito", "Palotes Palotes", 100.50f);
        empleados[1] = new Empleado("Manolo", "Del Bombo", 200.25f);
        empleados[2] = new Empleado("Rosita", "Del Pueblo", 340.10f);
        empleados[3] = new Empleado("Teresa", "La Guapa", 40.15f);
        empleados[4] = new Empleado("Carlos", "El Alto", 500.70f);

        float totalSueldo = 0f;
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
            totalSueldo += empleado.getSueldo();
        }

        System.out.println("El sueldo total es: " + totalSueldo);
        
        //segunda versión
        Empleados plantilla = new Empleados(5);
        
        plantilla.addEmpleado(new Empleado("Pepito", "Palotes Palotes", 100.50f), 0);
        plantilla.addEmpleado(new Empleado("Manolo", "Del Bombo", 200.25f), 1);
        plantilla.addEmpleado(new Empleado("Rosita", "Del Pueblo", 340.10f), 2);
        plantilla.addEmpleado(new Empleado("Teresa", "La Guapa", 40.15f), 3);
        plantilla.addEmpleado(new Empleado("Carlos", "El Alto", 500.70f), 4);
        
        System.out.println("El sueldo total es: " + plantilla.calcularSueldoTotal());
    }
}
