package examen_jdyc;//JESUS DANIEL YANAPA CRESPO
public class Examen_Ejercicio2 {//ejercicio 2
    public static void main(String[] args) {
        String op = null;
        int a=0,b=0;
        LeerTeclado lt=new LeerTeclado();
        System.out.println("Operaciones aritmeticas--->Seleccione una opcion:");
        System.out.println(" + ---->suma");
        System.out.println(" - ---->resta");
        System.out.println(" * ---->multiplicacion");
        System.out.println(" / ---->division ");
        op=lt.leer(op, "ELIJA SABIAMENTE");
        switch(op){
            case "+":
                a=lt.leer(a, "Ingrese primer número");
                b=lt.leer(b, "Ingrese segundo número");
                System.out.println("La suma: "+(a+b));
                break;
            case "-":
                a=lt.leer(a, "Ingrese primer número");
                b=lt.leer(b, "Ingrese segundo número");
                System.out.println("La resta: "+(a-b));
                break;
            case "*":
                a=lt.leer(a, "Ingrese primer número");
                b=lt.leer(b, "Ingrese segundo número");
                System.out.println("La multiplicacion: "+(a*b));
                break;
            case "/":
                a=lt.leer(a, "Ingrese primer número");
                b=lt.leer(b, "Ingrese segundo número");
                System.out.println("La division: "+(a/b));
                break;
           default:System.out.println("Opcion no valida");
        }
    }
}
