import java.util.Scanner;
public class actividad23{
    public static void main(String[]args){
       int num;
       
       int contador = 0;
       
       Scanner lector = new Scanner(System.in);
       
       System.out.println("Escribe un número: ");
       num = lector.nextInt();
       
       
       while (num>1 && num<100){
          System.out.println("El número no es correcto");
          
       }
       contador ++;
       
       if (num == 1 || num == 100){
           System.out.println("Es correcto");
       }
       System.out.println("El número de intentos ha sido: "+contador);
        
    }
   } 
   
