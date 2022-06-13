/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorasimples;

/**
 *
 * @author Xande
 */
public class Adicionar  implements Strategy{

    @Override
    public double operacao(double num1, double num2) {
        return num1 + num2;
    }
    
}
