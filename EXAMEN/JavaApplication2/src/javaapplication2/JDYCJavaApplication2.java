
package javaapplication2;

import javax.swing.JOptionPane;

public class JDYCJavaApplication2 {
    public static void main(String[] args) {
        int mayor=0;
        int menor=99;
        double promedio=0;
        int suma=0;
        for (int i = 1; i < 5; i++) {
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota: "+i));
                    if(nota>mayor){
                        mayor=nota;
                        }
                    if (nota<menor){
                            menor=nota;
                    }
                    suma=suma+nota; //ACUMULADOR
                 
    }
        promedio =suma/5;
        JOptionPane.showConfirmDialog(null,"La nota mayor es: "+mayor);
        JOptionPane.showConfirmDialog(null,"La nota menor es: "+menor);
        JOptionPane.showConfirmDialog(null,"La nota promedio: "+promedio);
    
}
