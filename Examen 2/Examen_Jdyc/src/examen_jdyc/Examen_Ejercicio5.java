/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_jdyc;

import java.util.Scanner;//JESUS DANIEL YANAPA CRESPO

/*
 Implementar un algoritmo de menú de
opciones para probar cada uno de los algoritmos
anteriores implementados.
 */
public class Examen_Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        boolean salir=false; int opcion;
        while (!salir){
        System.out.println("Acceso a los siguientes ejercicios:");
        System.out.println("¬Ejercicio 1 OPCION: | 1 |");
        System.out.println("¬Ejercicio 2 OPCION: | 2 |");
        System.out.println("¬Ejercicio 3 OPCION: | 3 |");
        System.out.println("¬Ejercicio 4 OPCION: | 4 |");
        System.out.println("¬Salir OPCION: | 5 |");
        opcion=leer.nextByte();
        switch(opcion){
            case 1:
                Examen_Ejercicio1 EX1=new Examen_Ejercicio1();
                EX1.main(args);
                break;
            case 2:
                Examen_Ejercicio2 EX2=new Examen_Ejercicio2();
                EX2.main(args);
                break;
            case 3:
                Examen_Jdyc EX3=new Examen_Jdyc();
                EX3.main(args);
                break;
            case 4:
                Examen_Ejercicio4 EX4=new Examen_Ejercicio4();
                EX4.main(args);
                break;
            case 5:
                salir=true;
                break;
            default:
                System.out.println("De la OPCION 1 a 5");
        }
        }
    }
}
