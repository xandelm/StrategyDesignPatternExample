/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorasimples;

/**
 *
 * @author Xande
 */
public class Subtrair implements Strategy{

    @Override
    public int operacao(int num1, int num2) {
        return num1 - num2;
    }
    
}