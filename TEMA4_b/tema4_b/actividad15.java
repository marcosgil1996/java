import java.util.Scanner;
public class actividad15{
    public static void main (String[]args){
        Scanner lector = new Scanner (System.in);
        int num;
        int i;
        long factorial = 1;
        
        System.out.println("Dime un número:");
        num = lector.nextInt();
       
        for (i=num;i>0;i--){
            factorial = factorial *i;
        }
        System.out.println("========================================================");
        System.out.println("El factorial de "+num+" es: "+factorial);
    }
}