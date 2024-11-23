/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_8;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_4_Ejercicio_resuelto_numero_13 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        double valcomp, valpag;
        byte pdes;
        String color;
        
        System.out.println("Ingrese el valor de la compra:");
        valcomp = lector.nextDouble();
        System.out.println("Ingrese el color de la bolita:");
        color = lector.next();
        
        if (color.toLowerCase().equals("blanco")) {
            pdes = 0;
        } else if (color.toLowerCase().equals("verde")) {
            pdes = 10;
        } else if (color.toLowerCase().equals("amarillo")) {
            pdes = 25;
        } else if (color.toLowerCase().equals("azul")) {
            pdes = 50;
        } else {
            pdes = 100;
        }
        
        valpag = valcomp-pdes*valcomp/100;
        System.out.println("El cliente debe pagar: $"+valpag);
    }
}
