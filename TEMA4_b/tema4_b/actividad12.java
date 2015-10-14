public class actividad12{
    public static void main (String[]args){
        int i ;
      
        int contapar = 0, sumaPares=0;
        int contaimpar = 0, sumaImpares=0;
        int contacuatro = 0, sumaCuatro=0;
        int contasiete = 0, sumaSiete=0;
        
    
        
        for (i=1;i<=100;i++){
            if (i%2==0){
                System.out.println("El número "+i+" es par");
                contapar++;
                sumaPares=sumaPares+i;
                
            }
            
        }
            System.out.println("==================================================");
            System.out.println("Los números pares son: "+contapar);
            System.out.println("La suma de los números pares es: "+sumaPares);
            System.out.println("==================================================");
        for (i=1;i<=100;i++){
            if (i%2==1){
                System.out.println(i);
                contaimpar++;
                sumaImpares=sumaImpares+i;
            }
            
        }
            System.out.println("==================================================");
            System.out.println("Los números impares son: "+contaimpar);
            System.out.println("La suma de los números impartes es: "+sumaImpares);
            System.out.println("==================================================");
        for (i=1;i<=100;i++){
            if (i%4==0){
                System.out.println(i);
                contacuatro++;
                sumaCuatro=sumaCuatro+i;
            }
            
        }
            System.out.println("==================================================");
            System.out.println("Los números múltiplos de 4 son: "+contacuatro);
            System.out.println("La suma de los números múltiples de 4 son: "+(contacuatro = contacuatro +i));
            System.out.println("==================================================");
         for (i=1;i==100;i++){
            if (i%7==0){
                System.out.println(i);
                contasiete++;
            }
            
        }
            System.out.println("==================================================");
            System.out.println("Los números múltiplos de 7 son: "+contasiete);
            System.out.println("La suma de los números múltiplos de 7 es: "+(contasiete = contasiete +i));
    }
}