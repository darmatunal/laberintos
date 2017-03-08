/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
/**
 *
 * @author Dario Arango
 */
public class Histograma {


City Unal=new City();  
Robot Dario=new Robot(Unal,0,1,Direction.EAST,100);
int[] Numero=new int[10];
int k;
int[] histo;

public void EscribirNumero(){
    System.out.println("Escriba algún número ");
    java.util.Scanner Leer=new java.util.Scanner(System.in);
    int a=Leer.nextInt();
    int b;
    // identificar cifras
    int mod;
    for(int i=0;i<10;i++){
       
       b=a/10; 
       mod=a % 10;
       a=b;
       Numero[i]=mod;
       if(a==0){
       this.k=i+1;
       i=9;}
    }
    this.histo=new int[k];
  for (int j=0;j<k;j++){
       this.histo[j]=this.Numero[k-1-j];
       System.out.println(histo[j]);
  }  
}
public void dibujarhisto(){
  int aux;
    for(int j=0;j<this.k;j++){
        aux=this.histo[j];
        //Avance
        for(int r=0;r<aux;r++){
        Dario.putThing();
        Dario.move();
        }
        // Devuelve y baja
        Dario.turnLeft();
        Dario.turnLeft();
        for(int r=0;r<aux;r++){
         Dario.move();
        }
        Dario.turnLeft();
        Dario.move();
        Dario.turnLeft();
    }
  
  }

public static void main(String [] Args){
Histograma histo1=new Histograma();
// Se le pide al usuario ecibir un numero entero 
//Hasta de 10 Digitos
histo1.EscribirNumero();
histo1.dibujarhisto();

}
}

