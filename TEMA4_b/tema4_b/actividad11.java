import java.util.Scanner;
public class actividad11{
    public static void main (String[]args){
        int A;
        int B;
        int i;
        
        int contador = 0;
        
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        A = lector.nextInt();
        System.out.println("============================================");
        System.out.print("Escribe otro número, menor que el anterior: ");
        B = lector.nextInt();
        System.out.println("============================================");
        for (i=A;i>=B;i--){
            if (i%2==0){
                System.out.println("El número "+i+" es par ---> "+contador ++);
                ;
            }
           
            
            else {
                System.out.println("El número "+i+" es impar");
            }
        }
        System.out.println("===============================================");
        System.out.println("El número total de pares es: "+contador);
    }
}