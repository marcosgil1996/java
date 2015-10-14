import java.util.Scanner;
public class actividad20{
    public static void main(String[]args){
        double num;
        int contador = 0;
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Introduce un número: ");
        num = lector.nextDouble();
         System.out.println("-------->"+contador ++);
        while (num!=0){
            System.out.println("Introduce un número: ");
            num = lector.nextDouble();
            System.out.println("Contando --->"+contador ++);
        }
        System.out.println("Has introducido el número 0");
        System.out.println("El total de números introducidos son: "+contador);
    }
}