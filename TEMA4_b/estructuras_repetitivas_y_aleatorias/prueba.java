import java.util.Scanner;
public class prueba{
    public static void main (String[]args){
        
        int fila;
        int columna;
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número de filas:");
        fila = lector.nextInt();
        columna = fila;
        
        while (fila >=1){
        for (int i=1;i<=columna;i++){
                if (i>=fila){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
        }
        }
        
        
        System.out.println(" ");
        fila--;
        columna++;
 
    }
}
}
