import java.util.Scanner;
public class actividad19{
    public static void main(String[]args){
        double num;
        boolean esNeg = false;
        int contador = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = lector.nextInt();
       
        while(num>0){
            System.out.println("Introduce un número: ");
            num = lector.nextInt();
            
            contador ++;
            
       }
       System.out.println("================================");
       if (num <0){
           num = -num;
           esNeg = true;
           System.out.println("Has introducido un número negativo");
          
        }
        
       System.out.println("El total de números introducidos es: "+contador);
}
}