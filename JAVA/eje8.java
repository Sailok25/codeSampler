import java.util.Scanner;
public class eje8 {
    public static void main(String[] args) {
    /* Exercici 8:
	Tenim una empresa amb 2 departaments i 3 subdepartaments a cada departament...
    - Ventes: Llibres // Videos // Bolis
    - Comandes: Normal // Basic // Premium

    El programa funciona sempre fins que es premi el "departament" 3.
    L'usuari ha de seleccionar quin departament i subdepartament vol i llavors ho hem d'imprimir per pantalla...*/

    int subopcio;
    int opcio;

    Scanner sc = new Scanner(System.in);

    System.out.println("Hola, amb qui tinc el plaer de parlar?");
    String nom = sc.nextLine();
    System.out.println("Encantada " +nom+ ". Amb quin departament et vols communicar?");
    System.out.println("1 - Ventes");
    System.out.println("2 - Comandes");
    opcio = sc.nextInt();

        if (opcio == 1){
            System.out.println("Has seleccionat el departament de Ventes.");
            System.out.println("Amb quin subdepartament et vols communicar?");
            System.out.println("1 - Llibres");
            System.out.println("2 - Videos");
            System.out.println("3 - Bolis");
            subopcio = sc.nextInt();

            if (subopcio == 1){
                System.out.println("Has seleccionat el subdepartament de Llibres");
            } else if (subopcio == 2) {
                System.out.println("Has seleccionat el subdepartament de Videos");
            } else if (subopcio == 3){
                System.out.println("Has seleccionat el subdepartament de Bolis");
            }

        } else if (opcio == 2) {
            System.out.println("Has seleccionat el departament de Comandes");
            System.out.println("Amb quin subdepartament et vols communicar?");
            System.out.println("1 - Normal");
            System.out.println("2 - Basic");
            System.out.println("3 - Premium");
            subopcio = sc.nextInt();

            if (subopcio == 1){
                System.out.println("Has seleccionat el subdepartament Normal");
            } else if (subopcio == 2) {
                System.out.println("Has seleccionat el subdepartament Basic");
            } else if (subopcio == 3){
                System.out.println("Has seleccionat el subdepartament Premium");
            }
        }
        sc.close();
    }
}