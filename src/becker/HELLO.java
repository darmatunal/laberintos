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
public class HELLO {
    
City Unal=new City();    
Robot Grafitero1=new Robot(Unal,5,4,Direction.NORTH,13);
Robot Grafitero2=new Robot(Unal,5,8,Direction.NORTH,13);
Robot Grafitero3=new Robot(Unal,5,12,Direction.NORTH,13);
Robot Grafitero4=new Robot(Unal,5,16,Direction.NORTH,13);
Robot Grafitero5=new Robot(Unal,5,20,Direction.NORTH,13);


public void WriteH(){

for(int k=0;k<5;k++){
  
Grafitero1.move();
Grafitero1.putThing();

 }
// Derecha
for(int k=0;k<3;k++){
  
Grafitero1.turnLeft();
 }

for(int k=0;k<2;k++){
  
Grafitero1.move();
 }
// Derecha
for(int k=0;k<3;k++){
  
Grafitero1.turnLeft();
 }
for(int k=0;k<5;k++){
Grafitero1.putThing();  
Grafitero1.move(); }

// Derecha
for(int j=0;j<2;j++){
for(int k=0;k<3;k++){
  
Grafitero1.turnLeft();
 }
Grafitero1.move();
}

for(int k=0;k<5;k++){
  
Grafitero1.move();

if(k==1){
Grafitero1.putThing();
}
 }
}
public void WriteL(){
for(int k=0;k<5;k++){
  
Grafitero3.move();
Grafitero3.putThing();

 }
// Derecha
for(int k=0;k<3;k++){
  
Grafitero3.turnLeft();
 }

for(int k=0;k<2;k++){
  
Grafitero3.move();
 }
// Derecha
for(int k=0;k<3;k++){
  
Grafitero3.turnLeft();
 }
for(int k=0;k<4;k++){  
Grafitero3.move(); }
Grafitero3.putThing();
// Derecha
for(int k=0;k<3;k++){
  
Grafitero3.turnLeft();
 }   
Grafitero3.move(); 
Grafitero3.putThing();
Grafitero3.move(); 
Grafitero3.putThing();
for(int k=0;k<15;k++){
Grafitero3.move(); 
}
}
public void WriteL2(){
for(int k=0;k<5;k++){
  
Grafitero4.move();
Grafitero4.putThing();

 }
// Derecha
for(int k=0;k<3;k++){
  
Grafitero4.turnLeft();
 }

for(int k=0;k<2;k++){
  
Grafitero4.move();
 }
// Derecha
for(int k=0;k<3;k++){
  
Grafitero4.turnLeft();
 }
for(int k=0;k<4;k++){  
Grafitero4.move(); }
Grafitero4.putThing();
// Derecha
for(int k=0;k<3;k++){
  
Grafitero4.turnLeft();
 }   
Grafitero4.move(); 
Grafitero4.putThing();
Grafitero4.move(); 
Grafitero4.putThing();
for(int k=0;k<15;k++){
Grafitero4.move(); 
}
}

public void WriteE(){
    for(int k=0;k<5;k++){
  
Grafitero2.move();
Grafitero2.putThing();

 }
// Derecha
for(int k=0;k<3;k++){
  
Grafitero2.turnLeft();
 }

for(int k=0;k<2;k++){
Grafitero2.putThing(); 
Grafitero2.move();
 }
// Derecha
for(int k=0;k<3;k++){
  
Grafitero2.turnLeft();
 }

Grafitero2.putThing();  
Grafitero2.move();   
Grafitero2.move();  
Grafitero2.putThing(); 
Grafitero2.move();   
Grafitero2.move();  
Grafitero2.putThing(); 
// Derecha

for(int k=0;k<3;k++){
  
Grafitero2.turnLeft();
 }
Grafitero2.move();
Grafitero2.putThing();
for(int k=0;k<3;k++){
  
Grafitero2.turnLeft();
 }



for(int k=0;k<5;k++){
  
Grafitero2.move();

if(k==1){
Grafitero2.putThing();
}
 }
}
public void WriteO(){

for(int k=0;k<5;k++){
  
Grafitero5.move();
Grafitero5.putThing();

 }
// Derecha
for(int k=0;k<3;k++){
  
Grafitero5.turnLeft();

 }

for(int k=0;k<2;k++){
  
Grafitero5.move();
Grafitero5.putThing();  
 }
// Derecha
for(int k=0;k<3;k++){
  
Grafitero5.turnLeft();
 }
for(int k=0;k<5;k++){
Grafitero5.putThing();  
Grafitero5.move(); }

// Derecha
for(int j=0;j<2;j++){
for(int k=0;k<3;k++){
  
Grafitero5.turnLeft();
 }
Grafitero5.move();
}
Grafitero5.putThing();
for(int k=0;k<5;k++){
Grafitero5.move();  
}
}
  

public static void main(String[] arg){

HELLO Escribir=new HELLO();    
Escribir.WriteH();
Escribir.WriteE();
Escribir.WriteL();
Escribir.WriteL2();
Escribir.WriteO();
}

}