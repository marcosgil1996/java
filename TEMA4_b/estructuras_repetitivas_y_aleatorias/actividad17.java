import java.util.Scanner;
public class actividad17{
    public static void main (String[]args){
        int numero;
        
        Scanner lector = new Scanner(System.in);
        
      System.out.println("Escriu un número: ");
         numero = lector.nextInt();
    
       
        System.out.println("===================================");

    while(numero>0){
         System.out.println("El resultado de "+numero+" elevadoa a dos es: "+numero*numero);
         System.out.println("Escriu un número: ");
         numero = lector.nextInt();
         System.out.println("===================================");
    }
        
     System.out.println("El número no se puede calcular");
        
}
}
