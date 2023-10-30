import java.util.Scanner;

public class exercici6 {
    public static void main(String[] args) {
        /* Exercici 12 - Escriu un programa en Java que ens demani 2 possibles notes d'un examen.
        Si la mitjana és menor de 5 ens a de dir "Suspès", si està entre 5 i 6,9 ens digui "Aprovat", Si està entre 7 i 8,9 ens digui "Notable" i si es superior de 9 ens digui "Excel·lent.
        Si la nota està entre 0 i 10 ens a d'imprimir un missatge dient que no són notes vàlides.
        */
        Double num1;
        Double num2;

        Scanner sc = new Scanner (System.in);

        System.out.println("Hola, escriu un numero del 0 al 10");
        num1 = sc.nextDouble();
        System.out.println("Escriu un altre numero del 0 al 10.");
        num2 = sc.nextDouble();

        Double resultat = (num1+num2)/2;
        if (resultat<=5){
            System.out.println("Suspès");
        } else if (resultat<=6.9){
            System.out.println("Aprovat");   
        } else if (resultat<=8.9){
            System.out.println("Notable");   
        } else if (resultat>=9){
            System.out.println("Excel·lent");   
        }
        sc.close();
    }
}