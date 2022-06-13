/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorasimples;

/**
 *
 * @author Xande
 */
public class Calculadora {
    public static void main(String[] args) {
        Context context = new Context(new Adicionar());
        double numero1=20, numero2=25;
        System.out.println(numero1 + " + " + numero2 + " = " + context.executaStrategy(numero1, numero2));
        
        //context = new Context(new Dividir());
        context.setStrategy(new Dividir());
        numero1 = 90; numero2 = 3;
        System.out.println(context.executaStrategy(numero1, numero2));
        
        
        context.setStrategy(new Exponencial());
        numero1 = 2; numero2 = 3;
        System.out.println(context.executaStrategy(numero1, numero2));
        
        
    }
}
