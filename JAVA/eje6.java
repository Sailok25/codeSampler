import java.util.Scanner;
public class eje6 {
    public static void main(String[] args) {
    /* Exercici 6:
	Imprimir per pantalla el número que ha ficat l'usuari. (hem de fer servir la classe Scanner) */ 
    
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriu un numero: ");
        num = sc.nextInt();

        System.out.println(num);

        sc.close();
    }
}
