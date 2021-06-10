import java.util.Scanner;

public class ejercicio10{
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

       int nMil = 0;
       int cantidadMultiplo6 = 0;
       int suma = 0;
       int n1 = 0;

       do{
        System.out.print("Ingrese un número para que se sume y llegue a 1000, numero actual " + nMil);
            n1 = scanner.nextInt();
           nMil = nMil + n1;
           if (n1 % 6 == 0){
               cantidadMultiplo6++;
           }
           if(n1 >= 1 && n1 <= 10){
               suma = suma + n1;
           }
       } while(nMil < 1000);

       System.out.println("La cantidad números múltiplos de 6 :"+ cantidadMultiplo6 + " y la suma de números que se encuentrarn entre 1 y 10" + suma);

    }
}