package proyecto1;

 //* @author Iván Jiménez

import java.util.Scanner;



public class Proyecto1 {

    
    public static void main(String[] args) {
        
        
               
        
            Scanner lector = new Scanner (System.in);
            System.out.println("========MENU PRINCIPAL=======");
            System.out.println("| 1. INICIAR JUEGO      |");
            System.out.println("| 2. REANUDAR JUEGO     |");
            System.out.println("| 3. SALIR              |");
            int opcion = lector.nextInt();
            switch (opcion) {
                
                case 1: 
                    System.out.println("Bienvenido, iniciaras en la posicion 1, gira el dado para avanzar. \nGanaras cuando llegues a la poscicion 64.");
                    break;
                case 2: 
                    System.out.println("mostrar datos");
                    break;
                case 3:
                   System.exit(0);
                   break;
            }
         
            
        
        int numero [][]= new int [8][8];
        char jugador [][] = new char[8][8];
        char trampas [][]= new char [8][8];
        
        int posicion = 0;  
        int mover = 0;
        int fila =7;
        
                
                int x = 64;
                boolean cambio = true;
                        
                for (int i = 0; i < numero.length; i++) {
                    if (cambio) {
                        for (int j = numero.length-1; j >= 0; j--) {
                            numero[i][j] = x;
                            x--;
                        }
                        cambio = false;
                }    
                         else {
                            for (int j = 0; j < numero[i].length; j++) {
                            numero[i][j] = x;
                            x--; 
                                    
                             cambio = true;

                        }
                    }
                } 
                jugador[7][7] = '@';
                trampas[7][7]= '#';
                
                while (posicion <=64) {            
            
        
                 System.out.println("-----------------------------------------");
                 for (int i = 0; i < numero.length; i++) {
                    for (int j = 0; j < numero[i].length; j++) {
                        
                        if (numero [i][j] < 10) {
                            System.out.print("|   " + numero[i][j]);
                        } else {
                          System.out.print("| " + numero [i][j]);
                        }    
                
                    }    
                    
                        System.out.println("|");
                     for (int j = 0; j < trampas.length; j++) {
                       System.out.print("|  " + jugador[i][j] + trampas[i][j]);
                       
                     
                     }
                        System.out.println("|");
                        // for de trampas
                        System.out.println("-----------------------------------------");
                 }
      
                    System.out.println("-Presione r para tirar el dado \n-Presione p para regresar el menu principal");
                    String opciones = lector.nextLine();
                 
                    switch (opciones){ 
                        case "r":
                            int dado = (int) (Math.random() * (6-2) + 2); 
                            System.out.println("Las Casillas que avanzaras son " + dado);
                             posicion += dado; 
                             
                             if (posicion >=56) {
                             }else if (posicion >= 56){
                            jugador[0][21-posicion]='@';
                             }else if (posicion >= 48){
                            jugador[1][21-posicion]='@';
                             }else if (posicion >= 40){
                            jugador[2][21-posicion]='@';
                             }else if (posicion >= 32){
                            jugador[3][21-posicion]='@';
                             } else if (posicion >= 24){
                            jugador[4][21-posicion]='@';
                             }
                             else if (posicion >= 16){
                            jugador[5][16 - posicion ]='@';
                             }else if (posicion >= 8){
                            jugador[6][posicion-8]='@';
                             } else {
                                 jugador [7][7-posicion]= '@';
                            }
                
                             break;
                             
                        case "p":
                             System.out.println("Despliega el Menu");
                             break;
                    }
                }
    }
                    }
                    
                
            
       
                
   

            

   


         
           

            
        
                
                
                
        
        

        
  
    
   
