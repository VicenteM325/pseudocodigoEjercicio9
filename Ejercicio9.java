import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args){
        int promedio1, promedio2, suma1 = 0, suma2 = 0, c = 0, a = 0;
        Scanner entrada = new Scanner(System.in);
        int temperatura1 = 0 , temperatura2 = 0;
        do{
            System.out.print("Ingrese temperatura 1: ");
            temperatura1 = entrada.nextInt();
            System.out.print("Ingrese temperatura 2: ");
            temperatura2 = entrada.nextInt();
            if(temperatura1 >= 5 && temperatura1 <= 15){
                suma1 = suma1+temperatura1;
                c = c+1;
            }
            if(temperatura2 >= 5 && temperatura2 <= 15){
                suma2 = suma2+temperatura2;
                a = a+1;
            } 

        }while(temperatura1 != 0);
        promedio1 = suma1/c;
        promedio2 = suma2/a;
        System.out.println("El promedio de temperaturas T1 entre 5 y 15 grados es = " + promedio1);
        System.out.println("El promedio de temperaturas T2 entre 5 y 15 grados es = " + promedio2);
    }
}