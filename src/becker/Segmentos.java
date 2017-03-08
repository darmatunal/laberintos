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
public class Segmentos {

int xo;
int yo;
int xm;
int ym;

City Unal=new City();    
Robot Dario=new Robot(Unal,5,4,Direction.NORTH,100);
Robot Dario1=new Robot(Unal,5,7,Direction.NORTH,100);
Robot Dario2=new Robot(Unal,5,10,Direction.NORTH,100);
//Thing Balon=new Thing(Unal,xo,yo);

 public void DibujarMuros(){
  this.xm=0;
  this.ym=0;
  
  for(int j=0;j<=2;j=j+1){
   ym=ym+3;   
  
  for (int i=1;i<=5;i=i+1){
   Wall muro= new Wall(Unal, (xm-1+i), ym, Direction.WEST);
  }
   for (int i=1;i<=3;i=i+1){
   Wall muro= new Wall(Unal, xm, (ym-1+i), Direction.NORTH);
  }
     for (int i=1;i<=5;i=i+1){
   Wall muro= new Wall(Unal, (xm-1+i), (ym+2), Direction.EAST);
  }
      for (int i=1;i<=3;i=i+1){
      if(i!=2){
   Wall muro= new Wall(Unal, xm+4, (ym-1+i), Direction.SOUTH);
      }
  }    
  }}
 
 public void dibujarnumeros(int a, int i){
 
     switch (a) {
 
         case 0:
        Thing Balon=new Thing(Unal,0,3+i); 
        Thing Balon1=new Thing(Unal,1,3+i);
        Thing Balon2=new Thing(Unal,2,3+i);
        Thing Balon3=new Thing(Unal,3,3+i);
        Thing Balon4=new Thing(Unal,4,3+i);
        Thing Balon5=new Thing(Unal,0,5+i); 
        Thing Balon6=new Thing(Unal,1,5+i); 
        Thing Balon7=new Thing(Unal,2,5+i); 
        Thing Balon8=new Thing(Unal,3,5+i); 
        Thing Balon9=new Thing(Unal,4,5+i);
        Thing Balon10=new Thing(Unal,0,4+i);
        Thing Balon11=new Thing(Unal,4,4+i);
        break;
        
        case 1:
        
        Thing Balon51=new Thing(Unal,0,5+i); 
        Thing Balon61=new Thing(Unal,1,5+i); 
        Thing Balon71=new Thing(Unal,2,5+i); 
        Thing Balon81=new Thing(Unal,3,5+i); 
        Thing Balon91=new Thing(Unal,4,5+i);
        
            
        break;
 
        case 2:
         Thing Balon200=new Thing(Unal,0,3+i); 
         Thing Balon52=new Thing(Unal,0,5+i);
         Thing Balon102=new Thing(Unal,0,4+i);
         Thing Balon22=new Thing(Unal,2,3+i);
         Thing Balon663=new Thing(Unal,3,3+i);
         Thing Balon42=new Thing(Unal,4,3+i);
         Thing Balon662=new Thing(Unal,2,4+i);
         Thing Balon62=new Thing(Unal,1,5+i); 
         Thing Balon72=new Thing(Unal,2,5+i); 
         Thing Balon92=new Thing(Unal,4,5+i);
         Thing Balon112=new Thing(Unal,4,4+i);
        
        break;
        
         case 3:
              Thing Balon300=new Thing(Unal,0,3+i); 
         Thing Balon53=new Thing(Unal,0,5+i);
         Thing Balon103=new Thing(Unal,0,4+i);
         Thing Balon23=new Thing(Unal,2,3+i);
         Thing Balon633=new Thing(Unal,3,5+i);
         Thing Balon43=new Thing(Unal,4,3+i);
         Thing Balon6333=new Thing(Unal,2,4+i);
         Thing Balon63=new Thing(Unal,1,5+i); 
         Thing Balon723=new Thing(Unal,2,5+i); 
         Thing Balon93=new Thing(Unal,4,5+i);
         Thing Balon133=new Thing(Unal,4,4+i);
        
        break;
        
         case 4:
         Thing Balon444=new Thing(Unal,0,3+i); 
        Thing Balon14=new Thing(Unal,1,3+i);
        Thing Balon24=new Thing(Unal,2,3+i);
        Thing Balon34=new Thing(Unal,2,4+i);
        Thing Balon54=new Thing(Unal,0,5+i); 
        Thing Balon64=new Thing(Unal,1,5+i); 
        Thing Balon74=new Thing(Unal,2,5+i); 
        Thing Balon114=new Thing(Unal,3,5+i);
        Thing Balon115=new Thing(Unal,4,5+i);
        
        break ;
        case 5:
        Thing Balon500=new Thing(Unal,0,3+i); 
         Thing Balon55=new Thing(Unal,0,5+i);
         Thing Balon105=new Thing(Unal,0,4+i);
         Thing Balon25=new Thing(Unal,2,3+i);
         Thing Balon653=new Thing(Unal,3,5+i);
         Thing Balon45=new Thing(Unal,4,3+i);
         Thing Balon652=new Thing(Unal,2,4+i);
         Thing Balon65=new Thing(Unal,1,3+i); 
         Thing Balon75=new Thing(Unal,2,5+i); 
         Thing Balon95=new Thing(Unal,4,5+i);
         Thing Balon152=new Thing(Unal,4,4+i);
        break ;
        
        
         case 6:
        Thing Balon600=new Thing(Unal,0,3+i); 
         Thing Balon766=new Thing(Unal,0,5+i);
         Thing Balon605=new Thing(Unal,0,4+i);
         Thing Balon76=new Thing(Unal,2,3+i);
         Thing Balon666=new Thing(Unal,3,5+i);
         Thing Balon656=new Thing(Unal,4,3+i);
         Thing Balon654=new Thing(Unal,2,4+i);
         Thing Balon66=new Thing(Unal,1,3+i); 
         Thing Balon760=new Thing(Unal,2,5+i); 
         Thing Balon96=new Thing(Unal,4,5+i);
         Thing Balon156=new Thing(Unal,4,4+i);
         Thing Balon153=new Thing(Unal,3,3+i);
        break ;
        
        case 7:
         
        Thing Balon517=new Thing(Unal,0,5+i); 
        Thing Balon617=new Thing(Unal,1,5+i); 
        Thing Balon717=new Thing(Unal,2,5+i); 
        Thing Balon817=new Thing(Unal,3,5+i); 
        Thing Balon917=new Thing(Unal,4,5+i);
        Thing Balon910=new Thing(Unal,0,3+i);
        Thing Balon911=new Thing(Unal,0,4+i);
           
         
        
        break;
         case 8:
         Thing Balon88=new Thing(Unal,0,3+i); 
        Thing Balon18=new Thing(Unal,1,3+i);
        Thing Balon28=new Thing(Unal,2,3+i);
        Thing Balon38=new Thing(Unal,3,3+i);
        Thing Balon48=new Thing(Unal,4,3+i);
        Thing Balon58=new Thing(Unal,0,5+i); 
        Thing Balon68=new Thing(Unal,1,5+i); 
        Thing Balon78=new Thing(Unal,2,5+i); 
        Thing Balon888=new Thing(Unal,3,5+i); 
        Thing Balon98=new Thing(Unal,4,5+i);
        Thing Balon188=new Thing(Unal,0,4+i);
        Thing Balon1188=new Thing(Unal,4,4+i);
        Thing Balon1189=new Thing(Unal,2,4+i);
        
        break;
         case 9:
         Thing Balon111=new Thing(Unal,0,3+i); 
        Thing Balon12=new Thing(Unal,1,3+i);
        Thing Balon15=new Thing(Unal,2,3+i);
        Thing Balon16=new Thing(Unal,0,5+i); 
        Thing Balon17=new Thing(Unal,1,5+i); 
        Thing Balon1899=new Thing(Unal,2,5+i); 
        Thing Balon19=new Thing(Unal,3,5+i); 
        Thing Balon20=new Thing(Unal,4,5+i);
        Thing Balon21=new Thing(Unal,0,4+i);
        Thing Balon2q2=new Thing(Unal,2,4+i);
        break;
     
        default:
        System.out.println("Digite un número de 0 a 9 ");
        break;
     
 }
 }
 public void identificar(){
 // Que empiece a recorrer la trayectoria
 int [][] N1= new int[5][3];
 int [][] N2= new int[5][3];
 int [][] N3=new int[5][3];
 
 Dario.move();
 Dario1.move();
 Dario2.move();
 Dario.turnLeft();
 Dario.move();
 Dario1.turnLeft();
 Dario1.move();
 Dario2.turnLeft();
 Dario2.move();
 
  if(Dario.canPickThing()){
 N1[4][0]=1;
 }
  
 else{
 N1[4][0]=0;
 }
  
 
  if(Dario1.canPickThing()){
 N2[4][0]=1;
 }
 else{
 N2[4][0]=0;
  }
  if(Dario2.canPickThing()){
 N3[4][0]=1;
 }
 else{
 N3[4][0]=0;
 }
  
 
 for(int i=0;i<3;i++){
 
 Dario.turnLeft();
 Dario1.turnLeft();
 Dario2.turnLeft();
 
 }
 // Recorrido de la primera fila
for(int i=0;i<=4;i++){
 
 
  if(Dario.canPickThing()){
 N1[4-i][0]=1;
 }
  
 else{
 N1[4-i][0]=0;
 }
  if (i!=4){
  Dario.move();
  }
  if(Dario1.canPickThing()){
 N2[4-i][0]=1;
 }
 else{
 N2[4-i][0]=0; 
 }
 if (i!=4){
  Dario1.move();
  }
 
  if(Dario2.canPickThing()){
 N3[4-i][0]=1;
 }
 else{
 N3[4-i][0]=0;
 }
 if (i!=4){
  Dario2.move();
  }
 }
// Recorrido de la segunda fila
for(int i=0;i<3;i++){
 
 Dario.turnLeft();
 Dario1.turnLeft();
 Dario2.turnLeft();
 
 }
  Dario.move();
  Dario1.move();
  Dario2.move();
  
 
for(int i=0;i<3;i++){
 
 Dario.turnLeft();
 Dario1.turnLeft();
 Dario2.turnLeft();
 
 }
// Recorrido de la primera fila
for(int i=0;i<5;i++){
 
 
  if(Dario.canPickThing()){
 N1[i][1]=1;
 }
 else{
 N1[i][1]=0;
 }
  if (i!=4){
  Dario.move();
  }
  if(Dario1.canPickThing()){
 N2[i][1]=1;
 }
 else{
 N2[i][1]=0;    
 }
  if (i!=4){
  Dario1.move();
  }
 
  if(Dario2.canPickThing()){
 N3[i][1]=1;
 }
 else{
 N3[i][1]=0;
 }
   if (i!=4){
  Dario2.move();
  }
 }
 Dario.turnLeft();
 Dario.move();
 
 if(Dario.canPickThing()){
 N1[4][2]=1;
 }
 else{
 N1[4][2]=0;
 }
 
 Dario1.turnLeft();
 Dario1.move();
 if(Dario.canPickThing()){
 N2[4][2]=1;
 }
 else{
 N2[4][2]=0;
 }
 
 Dario2.turnLeft();
  Dario2.move();
  if(Dario.canPickThing()){
 N3[4][2]=1;
 
 }
 else{
 N3[4][2]=0;
 }
  
 Dario.turnLeft();
 Dario1.turnLeft();
 Dario2.turnLeft();
  
  
 for(int i=0;i<=4;i++){
  if(Dario.canPickThing()){
  N1[4-i][2]=1;
 }
 else{
 N1[4-i][2]=0;
 }
  if (i!=4){
  Dario.move();
  }
  if(Dario1.canPickThing()){
     
 N2[4-i][2]=1;
 }
 else{
 N2[4-i][2]=0;
     
 }
  if (i!=4){
  Dario1.move();
  }
 
  if(Dario2.canPickThing()){
 N3[4-i][2]=1;
 }
 else{
 N3[4-i][2]=0;
 }
   if (i!=4){
  Dario2.move();
  }
 }

// Contar posiciones
int C1=0;
int C2=0;
int C3=0;
for (int k=0; k<=4; k++){
   for (int j=0; j<=2; j++) {
   if (N1[k][j]==1){
       C1=C1+1;
   
   }    
       
   if (N2[k][j]==1){
       C2=C2+1;
   
   }   
    if (N3[k][j]==1){
       C3=C3+1; }   
   }
}
   int num1=0;
   int num2=0;
   int num3=0;
   switch(C1) {
   case  5:
    num1=1;
      break; 
	
   case 7:
     num1=7;
      break; /* optional */
   case 9:
     num1=4;
      break; /* optional */
   case 10:
     num1=9;
      break; /* optional */
      case 13:
     num1=8;
      break; /* optional */
      case 11:
          if (N1[1][0]==0 && N1[3][2]==0){
              num1=2;
          }
           if (N1[1][0]==0 && N1[3][0]==0){
              num1=3;
          }
           if (N1[1][2]==0 && N1[3][0]==0){
              num1=5;
          }
          break ;
      case 12:
          if (N1[1][2]==0){
              num1=6;
          }
           if (N1[2][1]==0){
              num1=0;
          }
          break ;    
   
   default : 
       System.out.println("Algo anda mal");
}
   switch(C2) {
   case  5:
    num2=1;
      break; 
	
   case 7:
     num2=7;
      break; /* optional */
   case 9:
     num2=4;
      break; /* optional */
   case 10:
     num2=9;
      break; /* optional */
      case 13:
     num2=8;
      break; /* optional */
      case 11:
          if (N2[1][0]==0 && N2[3][2]==0){
              num2=2;
          }
           if (N2[1][0]==0 && N2[3][0]==0){
              num2=3;
          }
           if (N2[1][2]==0 && N2[3][0]==0){
              num2=5;
          }
          break ;
      case 12:
          if (N2[1][2]==0){
              num2=6;
          }
           if (N2[2][1]==0){
              num2=0;
          }
          break ;    
   /* you can have any number of case statements */
   default : /* Optional */
       System.out.println("Algo anda mal");
}
   switch(C3) {
   case  5:
    num3=1;
      break; 
	
   case 7:
     num3=7;
      break; /* optional */
   case 9:
     num3=4;
      break; /* optional */
   case 10:
     num3=9;
      break; /* optional */
      case 13:
     num3=8;
      break; /* optional */
      case 11:
          if (N3[1][0]==0 && N3[3][2]==0){
              num3=2;
          }
           if (N3[1][0]==0 && N3[3][0]==0){
              num3=3;
          }
           if (N3[1][2]==0 && N3[3][0]==0){
              num3=5;
          }
          break ;
      case 12:
          if (N3[1][2]==0){
              num3=6;
          }
           if (N3[2][1]==0){
              num3=0;
          }
          break ;    
   /* you can have any number of case statements */
   default : /* Optional */
       System.out.println("Algo anda mal");
}
     System.out.println(num1);
     System.out.println(num2);
     System.out.println(num3);
     
     
     
     //  for (int k=0; k<=4; k++){
     //for (int j=0; j<=2; j++) {
     //   System.out.println(N2[k][j]);
     //}}
     //System.out.println(N2[0][0]);    
 
 }
 
public static void main(String[] args){
    Segmentos numeros=new Segmentos();
    // Se dibujan los muros
    numeros.DibujarMuros();
    // Aca se invcan los metodos para
    // Dibujar los numeros, se deben poner en la primera columna
    // La segunda siempre va 0 3 6
    numeros.dibujarnumeros(4,0);
    numeros.dibujarnumeros(2,3);
    numeros.dibujarnumeros(1,6);
    numeros.identificar();


}
}