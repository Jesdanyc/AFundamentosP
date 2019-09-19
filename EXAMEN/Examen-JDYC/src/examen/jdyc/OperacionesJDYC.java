package examen.jdyc;

import java.util.Scanner;

public class OperacionesJDYC {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Ingrese la operacion deseada \n 1:suma 2:resta 3:multiplicacion 4: division");
        Integer op=sn.nextInt();
        System.out.println("Ingrese Primer numero");
        int un=sn.nextInt();
        System.out.println("Ingrese la Segundo numero");
        int wo=sn.nextInt();
        switch (op){
            case 1:{
                int resultado=un+wo;
                System.out.println("La suma es: "+resultado );}
                break;
            case 2:{
                int resultado = un-wo;
                System.out.println("La resta es: "+resultado);}
                break;
            case 3:{
                int resultado = un*wo;
                System.out.println("La multiplicación es: "+resultado);}
                break;
            case 4:{
                int resultado = un/wo;
                System.out.println("La division es: "+resultado);}
                break;
        
            
        }
            
        
    }
}
