package examen.jdyc;

import java.util.Scanner;

public class DadolostresnumerosJDYC {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int mayor;
        int menor;
        int medio = 0;
        System.out.println("Ingrese primer numero");
        int un=sn.nextInt();
        System.out.println("Ingrese segundo numero");
        int wo=sn.nextInt();
        System.out.println("Ingrese tercer numero");
        int tres=sn.nextInt();
            if (un>wo && un>tres){
                mayor=un;
                if (wo>tres){
                    medio=wo;
                    menor=tres;
                }
                }else{
                medio=wo;
                menor=tres;
            }
            if (wo>un && wo>tres){
                mayor=wo;
                if (un>tres){
                    medio=un;
                    menor=tres;
                }
                }else{
                medio=tres;
                menor=un;                
            }
            if (tres>wo && tres>un){
                mayor=tres;
                if (wo>un){
                    medio=wo;
                    menor=un;
                }
                }else{
                medio=un;
                menor=wo;              
            } 
              System.out.println("El numero central es: "+medio );
            }     
        }
   

