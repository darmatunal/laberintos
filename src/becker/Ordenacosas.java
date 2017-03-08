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
public class Ordenacosas {


City Unal=new City();    
Robot Dario=new Robot(Unal,0,0,Direction.EAST,100);
Thing[] Balon=new Thing[63];

//Ubicación de bolas
public void Ubicar(){
int k=2;
int j=0;

    for(int s=0;s<=8;s++){
    for(int i=0;i<=k;i++){
    Balon[j]=new Thing(Unal,s,i);
    j=j+1;
    
    }
    k=k+1;
    }
}
public void Ordenar(){

//Máxima columna     

int fil,col;


//Ande por instinto

for(int rr=0; rr<=9;rr++){   
    col=0;
    int col2=1;
int u=13;
int k=0;
for(int i=0; i<=u;i++){
if(Dario.canPickThing()){
Dario.move();
                       }
else{
// Se devuelve
Dario.turnLeft();
Dario.turnLeft();
Dario.move();
// Agarra la bola que va a mover
Dario.pickThing();
//identifica fila y columna
col=Dario.getAvenue();
System.out.println("la "+col);
   
fil=Dario.getStreet();
//Se voltea
Dario.turnLeft();
Dario.turnLeft();
// El limite
for(int r=0; r<10-col-k;r++){
Dario.move();   
Dario.putThing();
// Se mueve simulando llevar la bola
if(Dario.canPickThing()){
Dario.pickThing();}
// Cuando llega al destino
if (r==9-col-k){
Dario.putThing();
}
}

k=k+1;
// k indica cuanto debe volver de nuevo
// Ya llego ahora debe devolverse
Dario.turnLeft();
Dario.turnLeft();

for(int g=0; g<18;g++){
if(col2!=0){
   
Dario.move(); 
}
 System.out.println(col2);
 
col2=Dario.getAvenue();
if(col2==col-1||col2==0){

g=20;
}
}
if(col2==0&&!Dario.canPickThing()){
    i=13;
}
Dario.turnLeft();
Dario.turnLeft();


}




}
Dario.turnLeft();
Dario.turnLeft();
Dario.turnLeft();
Dario.move();
Dario.turnLeft();
}

}

    

public static void main(String []args){
    Ordenacosas Orden=new Ordenacosas();
    Orden.Ubicar();
    Orden.Ordenar();
}

}
