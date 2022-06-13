/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorasimples;

import static java.lang.Math.pow;

/**
 *
 * @author Xande
 */
public class Exponencial implements Strategy{

    @Override
    public double operacao(double num1, double num2) {
        return pow(num1,num2);
    }
    
}
