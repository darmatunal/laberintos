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
public class Ladrillos2 {
City Unal=new City();  
// Se crean don arreglos de muros.
//Uno para los verticales otro para los horizontales
Wall[] MurosVert=new Wall [20];
Wall[] MurosHori=new Wall [18];
Robot Carro=new Robot(Unal,8,0,Direction.NORTH,8);


public void DibujarMuros(){
int k=0;
int x=8;
for(int i=1;i<=4;i++){
MurosHori[k]=new Wall(Unal,x-1,i,Direction.SOUTH);
k=k+1;
}
for(int i=0;i<=4;i++){
MurosHori[k]=new Wall(Unal,x-5,i,Direction.NORTH);
k=k+1;
}
for(int i=1;i<=4;i++){
MurosHori[k]=new Wall(Unal,x-8+4,i+7,Direction.SOUTH);
k=k+1;
}
for(int i=0;i<=4;i++){
MurosHori[k]=new Wall(Unal,x-8,i+7,Direction.NORTH);
k=k+1;
}
k=0;
for(int i=0;i<=4;i++){
MurosHori[k]=new Wall(Unal,i+3,0,Direction.WEST);
}
for(int i=0;i<=4;i++){
MurosHori[k]=new Wall(Unal,i+3,4,Direction.EAST);
}

for(int i=0;i<=4;i++){
MurosHori[k]=new Wall(Unal,i,7,Direction.WEST);
}
for(int i=0;i<=4;i++){
MurosHori[k]=new Wall(Unal,i,11,Direction.EAST);
}    
}
public void Ponerladrillos(){
Thing [] ladrillos=new Thing[8];
ladrillos[0]=new Thing(Unal,3,1);
ladrillos[1]=new Thing(Unal,3,3);
ladrillos[2]=new Thing(Unal,4,0);
ladrillos[3]=new Thing(Unal,4,4);
ladrillos[4]=new Thing(Unal,6,0);
ladrillos[5]=new Thing(Unal,6,4);
ladrillos[6]=new Thing(Unal,7,1);
ladrillos[7]=new Thing(Unal,7,3);
} 
public void turnRigth(){
Carro.turnLeft();
Carro.turnLeft();
Carro.turnLeft();
}
public void Devolver1(){
int fil;
int col;
Carro.turnLeft();
Carro.turnLeft();
for(int i=0;i<=4;i++){
    col=Carro.getAvenue();
    fil=Carro.getStreet();
    if(fil!=7){
    this.Carro.move();  
    }
    else{i=5;}
   
}    
}



public void BuscarBolas(){

    for(int i=0;i<=4;i++){
    Carro.move(); 
      if(Carro.canPickThing()){
      Carro.pickThing();
      i=5;
      Devolver1();
                          }  
  } 
}
public void BuscarBolas1(){
    
    
    for(int i=0;i<=4;i++){
    Carro.move(); 
      if(Carro.canPickThing()){
      Carro.pickThing();
                          }
    }
    turnRigth();
    for(int i=0;i<=3;i++){
    Carro.move(); 
      if(Carro.canPickThing()){
      Carro.pickThing();
                          }
    }
    turnRigth();
    for(int i=0;i<=3;i++){
    Carro.move(); 
      if(Carro.canPickThing()){
      Carro.pickThing();
                          }
    }
    turnRigth();
    for(int i=0;i<=3;i++){
    Carro.move(); 
      if(Carro.canPickThing()){
      Carro.pickThing();
                          }
    }
   
    Carro.turnLeft();
  
}
public void ReubicarLadrillos(){
int [][] Coor={{3,7},{1,7},{0,8},{0,10},{1,11},{3,11},{4,10},{4,8}};
int col;
int fil;

int[][] Aux=new int[1][2];
int cont=0;
    for(int i=0;i<=3;i++){
    Carro.move();
   col=Carro.getAvenue();
   fil=Carro.getStreet();
   Aux[0][0]=fil;
   Aux[0][1]=col;
      if(Aux[0][0]==Coor[cont][0]&& Aux[0][1]==Coor[cont][1] ){  
      Carro.putThing();
      cont=cont+1;
                          }
    }
    turnRigth();
    for(int i=0;i<=3;i++){
    Carro.move();
   col=Carro.getAvenue();
   fil=Carro.getStreet();
   Aux[0][0]=fil;
   Aux[0][1]=col;
      if(Aux[0][0]==Coor[cont][0]&& Aux[0][1]==Coor[cont][1] ){  
      Carro.putThing();
      cont=cont+1;
                          }
    
    }
    turnRigth();
        for(int i=0;i<=3;i++){
    Carro.move();
   col=Carro.getAvenue();
   fil=Carro.getStreet();
   Aux[0][0]=fil;
   Aux[0][1]=col;
      if(Aux[0][0]==Coor[cont][0]&& Aux[0][1]==Coor[cont][1] ){  
      Carro.putThing();
      cont=cont+1;
                          }
    
    }
    turnRigth();
        for(int i=0;i<=3;i++){
    Carro.move();
   col=Carro.getAvenue();
   fil=Carro.getStreet();
   Aux[0][0]=fil;
   Aux[0][1]=col;
   if(i!=3){
      if(Aux[0][0]==Coor[cont][0]&& Aux[0][1]==Coor[cont][1] ){  
      Carro.putThing();
      cont=cont+1;
                          }}
    
    }
    Carro.turnLeft();
    Carro.move();
     Carro.turnLeft();
    Carro.move();
    
    
 
}
    

public void PuertaAaPuertaB(){
 // Se parte de que esta en la puerta A mirando hacía fuera
Carro.move();
Carro.turnLeft();
for(int i=0;i<7;i++){
Carro.move();
}
Carro.turnLeft();

for(int i=0;i<4;i++){
Carro.move();
}

}
public void PuertaBaPuertaA(){
 // Se parte de que esta en la puerta A mirando hacía fuera
for(int i=0;i<4;i++){
Carro.move();
}
turnRigth();
for(int i=0;i<7;i++){
Carro.move();
}
turnRigth();


}


public static void main(String []Args){
Ladrillos2 Ladri=new Ladrillos2();
Ladri.DibujarMuros();
Ladri.Ponerladrillos();
Ladri.BuscarBolas1();
Ladri.PuertaAaPuertaB();
Ladri.ReubicarLadrillos();
//Ladri.PuertaBaPuertaA();



}

}
