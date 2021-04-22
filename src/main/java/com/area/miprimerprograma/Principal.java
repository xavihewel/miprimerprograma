/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.miprimerprograma;

/**
 *
 * @author xavier.verges
 */
public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println("La suma d'enters és " + calculadora.suma(2, 2));
    }
}
