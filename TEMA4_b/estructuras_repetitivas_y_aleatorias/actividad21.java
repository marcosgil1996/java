import java.util.Scanner;
public class actividad21{
    public static void main(String[]args){
        int i;
        int num;
        int contador = 0;
        int sumador = 0;
        boolean esNeg = false;
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        num = lector.nextInt();
        while(num>0){
            System.out.println("Introduce un número: ");
            num = lector.nextInt();
            contador ++;
            sumador=sumador + 1;
        }
       
       
        System.out.println("===========================");
        if (num<0){
            num = -num;
            esNeg = true;
            System.out.println("Has introducido un número negativo");
        }
        
        System.out.println("La mediana de los números introducidos es: "+(sumador+contador)/(contador));
    }
}