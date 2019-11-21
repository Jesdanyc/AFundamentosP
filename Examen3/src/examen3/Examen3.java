package examen3;

import java.util.Scanner;

public class Examen3 {
static Scanner cs=new Scanner(System.in);
     public static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
               if(j==0 && i!=0){System.out.println("");}
                System.out.print("\t"+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
        public static int[][] ejercicio24(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            if(j%2==0){
            for (int i = dim-1; i >=0; i--) {                
                M[j][i]=numInit;
                numInit++;}            
            }else{
            for (int i = 0; i <dim; i++) {                
                M[j][i]=numInit;
                numInit++; }            
            }
        }
        return M;
        }
    public static int[][] ejercicio32(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int liz = dim-1-c; liz >c; liz--) {//subida
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {//derecha superior
              M[c][ls]=numInit;
              numInit++;
            }
            for (int ld = c; ld < dim-1-c; ld++) {//abajo derecho
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {//abajo izquierdo 
              M[dim-1-c][li]=numInit;
              numInit++;
            }
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
     public static int[][] suma2MatricesSimetricos(int[][] A, int[][] B){
        int [][] NM=new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                NM[i][j]=A[i][j]-B[i][j];
            }
        }
        return NM;
    }
         public static void main(String[] args) {
             //imprimirMatriz(ejercicio24());
             //imprimirMatriz(ejercicio32());
             imprimirMatriz(suma2MatricesSimetricos(ejercicio24(),ejercicio32()));
    }

}
