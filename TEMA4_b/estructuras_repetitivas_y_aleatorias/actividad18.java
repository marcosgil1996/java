import java.util.Scanner;
public class actividad18{
    public static void main(String[]args){
        int num;
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Intrdouzca un número");
        num = lector.nextInt();
        while(num!=0){
           if(num%2==0){
               System.out.println("El número "+num+" es par");
           }
           else{
               System.out.println("El número "+num+" es impar");
           }
           System.out.println("Introduzca un número");
           System.out.println("=================================");
           num = lector.nextInt();
           
           
           

        }
        System.out.println("=================================");
        System.out.print("No se permite introducir el valor 0");
        
    }
}