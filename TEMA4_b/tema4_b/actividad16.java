import java.util.Scanner;
public class actividad16{
    public static void main(String[]args){
        int num=2;
        int cont = 1;
        boolean esPrimo = true;
        
        while (cont<=10){
            esPrimo=true;
            
            
            for (int j = 2;j<num;j++){
                if (num%j==0){
                    esPrimo=false;
                    break;
                }
            }
            
            
            if (esPrimo){
                System.out.println("El núnero "+num+" es primo");
                cont++;
            }
            num++;
        }
        
        
    }
}