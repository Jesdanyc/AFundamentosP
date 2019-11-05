package examen_jdyc;//JESUS DANIEL YANAPA CRESPO

import java.util.Scanner;
/*El Gerente de una compañía automotriz desea
determinar el impuesto que va a pagar por cada uno de
los automóviles que posee, además del total que va a
pagar por cada categoría y por todos los vehículos,
basándose en la siguiente clasificación:

Los vehículos con clave 1 pagan 10% de su valor

Los vehículos con clave 2 pagan 7% de su valor

Los vehículos con clave 3 pagan 5% de su valor.

Considerando que por lo menos de cada modelo o
categoría hay un vehículo y por cada modelo de vehículo
tiene un único precio.*/
public class Examen_Ejercicio1 {
    public static void main(String[] args) {
        int NumerodeAuto,Valor_de_auto,clave,suma=0,impuesto=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese numero de automoviles");
        NumerodeAuto=leer.nextByte();
        System.out.println("Ingrese valor de su automovil");
        Valor_de_auto=leer.nextByte();
        for (int i = 0; i < NumerodeAuto; i++) {
            System.out.println("Ingrese clave de su automovil");
            clave=leer.nextByte();
            if (clave==1){
            impuesto=(int) (Valor_de_auto*0.1);
                System.out.println("El impuesto es: "+impuesto);
                suma=suma+impuesto;
            }else if(clave==2){
                impuesto=(int) (Valor_de_auto*0.07);
                System.out.println("El impuesto es: "+impuesto);
                suma=suma+impuesto;
            }else if (clave==3){
                impuesto=(int) (Valor_de_auto*0.05);
                System.out.println("El impuesto es: "+impuesto);
                suma=suma+impuesto;
            }
            System.out.println("El monto a pagar es: "+suma);
        }
    }
}
