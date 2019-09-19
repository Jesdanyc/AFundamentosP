
package examen.jdyc;

import java.util.Scanner;


public class ExamenJDYC {
 //EJERCICIO NUMERO 1
  
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Ingrese Dias");
        int dia=sn.nextInt();
        System.out.println("Ingrese Gasto en hotel");
        int hot=sn.nextInt();
        System.out.println("Ingrese Gastos en comina");
        int com=sn.nextInt();
        int total =hot+com+100;
        int total2= total* dia;
        System.out.println("Gasto total "+total2);
    } 
}
