package proyecto1;

 //* @author Iván Jiménez

import java.util.Scanner;



public class Proyecto1 {

    
    public static void main(String[] args) {
        
        
        while (true) {            
        
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
                
                 System.out.println("-----------------------------------------");
                 for (int i = 0; i < numero.length; i++) {
                    for (int j = 0; j < numero[i].length; j++) {
                        
                        if (numero [i][j] < 10) {
                            System.out.print("|   " + numero[i][j]);
                        } else {
                          System.out.print("|  " + numero [i][j]);
                        }    
                
                    }    
                        System.out.println("|");
                        System.out.println("-----------------------------------------");
            
        }
                
        }
                
   }
            
}
   


         
           

            
        
                
                
                
        
        

        
  
    
   
