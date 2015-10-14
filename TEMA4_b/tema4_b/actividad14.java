import java.util.Scanner;
public class actividad14{
    public static void main (String[]args){
        double base;
        double exponente;
        double totalPotencia=1;
        boolean esNeg = false;
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un número que será la base: ");
            base = lector.nextDouble();
        System.out.println("=======================================================");
        
        System.out.print("Dime un segundo número para que sea el exponente: ");
            exponente = lector.nextDouble();
        System.out.println("=======================================================");
        if (exponente <0){
            exponente = -exponente;
            esNeg = true;
        }
        for(int i=1; i<=exponente; i++){
            totalPotencia=totalPotencia*base;
        }
        if(esNeg){
            totalPotencia = 1/totalPotencia;
        }
        System.out.println("Resultado: "+totalPotencia);
    }
}