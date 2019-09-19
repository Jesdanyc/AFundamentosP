package examen.jdyc;
public class SalarioJDYC {
    public static void main(String[] args) {
        double salario=1500; 
        double acum=1;
        System.out.println("Salario inicial 1500");
        for (int i = 2; i < 6; i++) {
            salario=salario+(salario*0.1);
            acum= salario+(salario*0.1);
            System.out.println("MESES: " +acum );
        }
        System.out.println("total: "+ acum );
    }
}
