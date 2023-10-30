import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        /* Programa que em demanai el valor de la nota (sobre 6) i em retorni el valor sobre 10 */
        Scanner sc = new Scanner(System.in);
        double valorSobre6;

        System.out.println("Introduce el valor de tu nota (sobre 6): ");
        valorSobre6 = sc.nextDouble();
        if(valorSobre6>6){
            System.out.println("Idiota el ejercicio te pide sobre 6, prueba otra vez >:V");
        } else{
        double notaSobre10 = (valorSobre6 / 6) * 10;
        notaSobre10 = Math.round(notaSobre10*100.0)/100.0;
        System.out.println("Tu nota (sobre 10) es: " + notaSobre10);
        }
        sc.close();
    }
}