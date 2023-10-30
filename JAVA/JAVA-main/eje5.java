import java.util.Scanner;
public class eje5 {
    public static void main(String[] args) {
        /* Exercici 5:
        Imprimeix per pantalla 5 cops el teu nom i el número d'iteració. (utilitzant el bucle "while")
        El teu nom ha d'estar, també, en una variable.
        I hem d'imprimir: "El meu nom és: XXXX, iteració: YYY") */

		String nom;
		Scanner sc = new Scanner(System.in);
		int contador = 1;

		System.out.println("Escriu el teu nom: ");
		nom = sc.nextLine();

		while (contador <= 5){
			System.out.println(nom);
			contador++;
		}
		sc.close();
	}
}
