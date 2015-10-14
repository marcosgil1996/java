public class actividad10{
    public static void main(String[]args){
        int i;
        
        int contador = 0;
        int contador1 = 0;
        int contador2 = 0;
        for (i=1;i<=99;i++){
            if (i%2==1) {
            System.out.println(i);
            contador ++;
            }
        }
            System.out.println("======================================================");
            System.out.println("La suma total de los números impares es: "+contador);
            System.out.println("======================================================");
        for (i=1;i<=99;i++){
            if (i%2==0) {
            System.out.println(i);
            contador1 ++;
            }
        }
            System.out.println("======================================================");
            System.out.println("La suma total de los números pares es: "+contador1);
            System.out.println("======================================================");
        for (i=1;i<=99;i++){ 
            if (i%5==0){
            System.out.println(i);
            contador2 ++;
            }
        }
            System.out.println("======================================================");
            System.out.println("La suma total de los múltiplos de 5 es: "+contador2);
            System.out.println("======================================================");
        }
}