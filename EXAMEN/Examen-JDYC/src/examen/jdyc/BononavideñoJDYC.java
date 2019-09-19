package examen.jdyc;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class BononavideñoJDYC {
    //EJERCICIO 2
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        double bono=0;
        System.out.println("Ingrese Antiguedad");
        int ant=sn.nextInt();
        System.out.println("Ingrese Sueldo");
        int sue=sn.nextInt();
        if (ant>4 && sue<2000){
             bono=sue*0.25;
        }else{
            bono=sue*0.20;
        }
        System.out.println("Bono recibidos es: " +bono );
    } 
}
