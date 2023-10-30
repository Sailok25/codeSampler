import java.util.Scanner;
public class exercici5 {
    public static void main(String[] args) {
        /* Exercici 11 - Escriu un programa en Java on donades les hores treballades d'una persona i el valor per hora.
        Calculi el seu salari i l'imprimeixi per pantalla.
        */
        Scanner sc = new Scanner(System.in);
        int salari = 10;
        int hora;

        System.out.println("Quantes hores has treballat?");
        hora = sc.nextInt();

        int salarihora = salari * hora;
        System.out.println("El salari de aquest treballador es: " +salarihora+"euros");

        sc.close();
    }
}
