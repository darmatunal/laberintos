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
public class Futbol {

int xo=10;
int yo=10;

City Unal=new City();    
Robot Dario=new Robot(Unal,xo,yo,Direction.WEST,100);
Thing Balon=new Thing(Unal,xo,yo);

public void advanceF(){
int fila;
int columna;

if(Dario.canPickThing()){
Dario.pickThing();

}
 this.Dario.move();  
fila=Dario.getStreet();
columna=Dario.getAvenue(); 
this.Balon=new Thing(Unal,fila,(columna));
}


public void advanceLeft(){
int fila;
int columna;
Dario.turnLeft();
if(Dario.canPickThing()){
Dario.pickThing();
}
 this.Dario.move();   
 fila=Dario.getStreet();
 columna=Dario.getAvenue();
 this.Balon=new Thing(Unal,fila,(columna)); 
 }
public void advanceRight(){
int fila;
int columna;
Dario.turnLeft();
Dario.turnLeft();
Dario.turnLeft();
if(Dario.canPickThing()){
Dario.pickThing();
}
 this.Dario.move();  
 fila=Dario.getStreet();
 columna=Dario.getAvenue();
 this.Balon=new Thing(Unal,fila,(columna)); 
}
/// otros métodos
public static void main(String[] args){

Futbol futbol=new Futbol();
futbol.advanceF();
futbol.advanceF();
futbol.advanceRight();
futbol.advanceLeft();
futbol.advanceF();
futbol.advanceF();
futbol.advanceRight();
futbol.advanceLeft();
futbol.advanceF();
futbol.advanceF();
futbol.advanceLeft();
futbol.advanceRight();
futbol.advanceF();
futbol.advanceF();

}


}
 