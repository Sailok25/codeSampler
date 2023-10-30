import java.util.Scanner;
public class eje7 {
    public static void main(String[] args) {
    /* Exercici 7:
	Imprimir per pantalla la suma de numeros que ha ficat l'usuari. (hem de fer servir la classe Scanner) */    
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;

    System.out.println("Inserta un numero:");
    num1 = sc.nextInt();

    System.out.println("Inserta un segon numero");
    num2 = sc.nextInt();

    int suma = num1 + num2;

    System.out.println("El resultat es: " +suma);

    sc.close();
    }
}
