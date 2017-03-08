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
public class Nuggets {

City Unal=new City();  
// Se crean don arreglos de muros.
//Uno para los verticales otro para los horizontales
Wall[] MurosVert=new Wall [26];
Wall[] MurosHori=new Wall [24];
Thing nug1=new Thing(Unal,1,6);
Thing nug2=new Thing(Unal,2,4);
Thing nug3=new Thing(Unal,4,3);
// Creación de matrices que guardan existencia de muros
int[][] MVERT={{0, 0 ,1,0, 0, 0, 1, 0, 0},{0,0,1,1,0,1,0,1,0},{0,1,0,1,1,0,1,0,1},{1,0,1,0,1,0,0,0,1},{1,0,1,1,0,1,1,0,1},{0,1,0,1,1,0,1,1,0}};
int[][] MHOR={{0,0,1,1,1,1,0,0},{0,0,0,1,1,0,1,0},{0,1,0,0,0,1,0,1},{1,0,1,0,1,0,1,0},{0,1,0,1,0,1,1,0},{1,0,0,0,1,0,0,1},{0,1,1,0,0,0,1,0}};
      
Robot Dario=new Robot(Unal,5,6,Direction.NORTH,100);

public void DibujarEscena(){
  // De acuerdo a las matrices 
  //Se dibujan los muros en dirección WEST y NORTH
int k=0;
for(int j=0;j<=5;j++){
for(int i=0;i<=8;i++){
if(MVERT[j][i]==1){
MurosVert[k]=new Wall(Unal,j,i, Direction.WEST);
k=k+1;
}
}
}
 k=0;
for(int j=0;j<=6;j++){
for(int i=0;i<=7;i++){
if(MHOR[j][i]==1){
MurosHori[k]=new Wall(Unal,j,i, Direction.NORTH);
k=k+1;
                }
                   }
                    }  
}
public void CogerNuggets(){
Dario.move();
for(int j=0;j<3;j++){
Dario.turnLeft();
}
Dario.move();
Dario.turnLeft();
Dario.move();
Dario.move();

Dario.turnLeft();
Dario.move();

for(int j=0;j<3;j++){
Dario.turnLeft();
}
Dario.move();
Dario.pickThing();
for(int j=0;j<2;j++){
Dario.turnLeft();
}
Dario.move();
Dario.turnLeft();
Dario.move();
for(int j=0;j<3;j++){
Dario.turnLeft();
}
Dario.move();
for(int j=0;j<3;j++){
Dario.turnLeft();
}
Dario.move();
Dario.move();
for(int j=0;j<3;j++){
Dario.turnLeft();
}
Dario.move();
Dario.turnLeft();
Dario.move();
Dario.pickThing();
Dario.turnLeft();
Dario.turnLeft();
Dario.move();
for(int j=0;j<3;j++){
Dario.turnLeft();
}
Dario.move();
for(int j=0;j<3;j++){
Dario.turnLeft();
}
Dario.move();
Dario.turnLeft();
Dario.move();
for(int j=0;j<3;j++){
Dario.turnLeft();
}
Dario.move();
Dario.pickThing();
Dario.turnLeft();

Dario.move();


}

public static void main(String[] Args){
Nuggets nug=new Nuggets();
    nug.DibujarEscena();
    nug.CogerNuggets();
  

}

}
