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
public class Limpiacosas {
City Unal=new City();    
Robot Dario=new Robot(Unal,8,4,Direction.NORTH,100);

// se ponen la suciedades
Thing Sucio1=new Thing(Unal,1,4);
Thing Sucio2=new Thing(Unal,7,4);
Thing Sucio3=new Thing(Unal,4,1);
Thing Sucio4=new Thing(Unal,4,7);

public void limpiar(){
//Vamos a contar las 10 líneas
int max=3;
Dario.move(); Dario.pickThing();

for(int k=0;k<=5;k++){
Dario.move();
if(Dario.canPickThing()){
Dario.pickThing();
Dario.turnLeft();
Dario.turnLeft(); k=2;}}
                   
Dario.turnLeft();

for(int j=0;j<max;j++){
Dario.move();
if (j==2){
Dario.pickThing();
Dario.turnLeft();
Dario.turnLeft();
max=9;

}
}
Dario.pickThing();
}
public static void main(String []args){
Limpiacosas Limpia=new Limpiacosas();
Limpia.limpiar();

}
}
