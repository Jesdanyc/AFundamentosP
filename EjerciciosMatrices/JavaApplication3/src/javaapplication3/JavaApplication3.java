package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {//Jesus Daniel Yanapa Crespo 
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
    
    public static int[][] transformada01(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;               
            }
        }        
        return M;
    }
    
    public static int[][] transformada02(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;                  
            }
        }        
        return M;
        }
    
    public static int[][] transformada03(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                if((i+j)%2==0){
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;      
                }else{
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;      
                }
            }
        }        
        return M;
        }
    
    public static int[][] transformada04(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                if((i+j)%2==0){
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;      
                }else{
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;      
                }                
            }
        }        
        return M;
        }
    
    
    public static int[][] transformada06(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
    public static int [][] transformada07(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base");
        int munit=lt.nextInt();
        for (int i = 0; i <dim; i++) {
            for (int j = 0; j <dim-i; j++) {               
                M[i][j]=munit;
                munit++;
            
            }
        }    
        return M;
    }
    
    public static int [][] transformada12(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for(int j = 0; j <dim; j++) {
            for(int i = dim-1; i >=0+j; i--) {               
                M[j][i]=munit;
                munit++;
            
            }
        }
        
        return M;
    }
    public static int[][] transformada15(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for(int j = 0; j <dim; j++){
            for (int i = dim-1; i >=0+j; i--) {
                System.out.println("M["+i+"]["+j+"]="+numInit);
                M[i][j]=numInit;
                numInit++;
            }        
        }
        return M;
        }
    public static int[][] transformada16(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            for (int i = dim-1; i >=(dim-1)-j; i--) {
                System.out.println("M["+i+"]["+j+"]="+numInit);
                M[i][j]=numInit;
                numInit++;
            }        
        }
        return M;
        }
    public static int[][] transformada21(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            if(j%2==0){
            for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int i = dim-1; i >=0; i--) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
    public static int[][] transformada22(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            if(j%2==0){
            
            for (int i = dim-1; i >=0; i--) {                
                M[i][j]=numInit;
                numInit++;}            
            }else{
            for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++; }
        }}
        return M;
        }
   public static int[][] transformada23(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = dim-1; j>=0; j--){
            if(j%2==0){
                for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++;}      
            }else{
            
                for (int i = dim-1; i >=0; i--) { //              
                M[i][j]=numInit;
                numInit++; }             
            }
        }
        return M;
        }
    public static int[][] transformada24(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = dim-1; j>=0; j--){
            if(j%2==0){
            for (int i = dim-1; i >=0; i--) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
     public static int[][] transformada25(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            if(j%2==0){
            for (int i = 0; i <dim; i++) {                
                M[j][i]=numInit;
                numInit++; }            
            }else{
            for (int i = dim-1; i >=0; i--) {                
                M[j][i]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
     public static int[][] transformada26(){
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
     
    
        public static int[][] transformCaracol29(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ls = c; ls <dim-1-c; ls++) {//Superiro direccion derecha
              M[c][ls]=numInit;
              numInit++;
            } 
            for (int ld = c; ld < dim-1-c; ld++) {//Derecho direccion abajo 
              M[ld][dim-1-c]=numInit;
              numInit++;
            }  
            for (int li = dim-1-c; li >c; li--) {//abajo direccion izquierda
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {//izquierda direccion arriba 
              M[liz][c]=numInit;
              numInit++;
            }
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
    
    public static int[][] transformCaracol30(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld < dim-1-c; ld++) {
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {
              M[c][ls]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
    public static int[][] transformCaracol31(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
             for (int li = dim-1-c; li >c; li--) {//abajo direccion izquierda
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {//izquierda direccion arriba 
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {//Superiro direccion derecha
              M[c][ls]=numInit;
              numInit++;
            }        
            for (int ld = c; ld < dim-1-c; ld++) {//Derecho direccion abajo 
              M[ld][dim-1-c]=numInit;
              numInit++;
            }           
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
    public static int[][] transformCaracol32(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int liz = dim-1-c; liz >c; liz--) {//izquierda direccion Arriba 
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {//Superiro direccion derecha
              M[c][ls]=numInit;
              numInit++;
            }
            for (int ld = c; ld < dim-1-c; ld++) {//Derecho direccion abajo 
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {//inferior direccion izquierda
              M[dim-1-c][li]=numInit;
              numInit++;
            }
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
    public static int[][] transformCaracol33(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int liz = dim-1-c; liz >c; liz--) {//superior direccion izquierda 
              M[c][liz]=numInit;
              numInit++;
            }
            for (int lbs = c; lbs <dim-1-c; lbs++) {//abajo  lado  izquierda
              M[lbs][c]=numInit;
              numInit++;
            }
             for (int ld = c; ld < dim-1-c; ld++) {//Derecho direccion abajo 
              M[dim-1-c][ld]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {//derecha direccion arriba
              M[li][dim-1-c]=numInit;
              numInit++;
            }
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
    public static int[][] transformCaracol34(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld < dim-1-c; ld++) {//derecho direccion abajo 
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {//inferior direccion izquierda
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {//izquierda direccion arriba
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {//superior doreccion derecha 
              M[c][ls]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
    public static int[][] transformCaracol35(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld < dim-1-c; ld++) {//inferior direccion derecha
              M[dim-1-c][ld]=numInit;
              numInit++;
            }
             for (int li = dim-1-c; li >c; li--) {//derecha direccion arriba
              M[li][dim-1-c]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {//superior direccion izquierda
              M[c][liz]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {//izquierda direccion abajo
              M[ls][c]=numInit;
              numInit++;
            }                    
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }    
    public static int[][] transformCaracol36(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){           
           for (int li = dim-1-c; li >c; li--) {//derecha direccion arriba
              M[li][dim-1-c]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {//superior direccion izquierda
              M[c][liz]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {//izquierda direccion abajo
              M[ls][c]=numInit;
              numInit++;
            } 
            for (int ld = c; ld < dim-1-c; ld++) {//inferior direccion derecha
              M[dim-1-c][ld]=numInit;
              numInit++;
            }
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    } 
    public static void main(String[] args) {
        System.out.println("Ingrese el ejercicio deseado ");
        int ejerc=cs.nextInt();
        switch(ejerc){
            case 1:{
              imprimirMatriz(transformada01());
              break;
            }
            case 2:{
              imprimirMatriz(transformada02());
              break;
            }
            case 3:{
              imprimirMatriz(transformada03());
              break;
            }
            case 4:{
              imprimirMatriz(transformada04());
              break;
            }
            
            case 6:{
                imprimirMatriz(transformada06());
                break;
            }
            case 7:{
                imprimirMatriz(transformada07());
                break;
            }
            
            case 12:{
                imprimirMatriz(transformada12());
                break;
            }
            case 15:{
                imprimirMatriz(transformada15());
                break;
            }
            case 16:{
                imprimirMatriz(transformada16());
                break;
            }
            case 21:{
                imprimirMatriz(transformada21());
                break;
            }
            case 22:{
                imprimirMatriz(transformada22());
                break;
            }
            case 23:{
                imprimirMatriz(transformada23());
                break;
            }
            case 24:{
                imprimirMatriz(transformada24());
                break;
            }
            case 25:{
                imprimirMatriz(transformada25());
                break;
            }
            case 26:{
                imprimirMatriz(transformada26());
                break;
            }
            case 29:{
                imprimirMatriz(transformCaracol29());
                break;
            }
            case 30:{
                imprimirMatriz(transformCaracol30());
                break;
            }
            case 31:{
                imprimirMatriz(transformCaracol31());
                break;
            }
            case 32:{
                imprimirMatriz(transformCaracol32());
                break;
            }
            case 33:{
                imprimirMatriz(transformCaracol33());
                break;
            }
            case 34:{
                imprimirMatriz(transformCaracol34());
                break;
            }
            case 35:{
                imprimirMatriz(transformCaracol35());
                break;
            }
            case 36:{
                imprimirMatriz(transformCaracol36());
                break;
            }
        }
    }
}   
    

