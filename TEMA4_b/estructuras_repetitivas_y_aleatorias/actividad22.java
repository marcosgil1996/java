import java.util.Scanner;
public class actividad22{
    public static void main(String[]args){
        int num;
        boolean primero=true;
        int i=2;
        
        Scanner lector = new Scanner (System.in);
        num = lector.nextInt();
        
       while (num!=1){
           if((num%2==0) && primero){
            System.out.println("El resultat es...");
            System.out.print(num+" = "+i);
           }
       }
        
        
        Scanner lector = new Scanner (System.in);
        
       
    }
}
