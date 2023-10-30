public class eje3 {
    public static void main(String[] args) {
        /* Exercici 3:
        Fem un prgroama en java on: 
        Si una persona te menys de 3 anys surti per pantalla: "Bebe"
        Si no, si en te menys de 14 digui: "Nen"
        Si no, si en te menys de 25: "Jove"
        Si no, digues: "Adult" */

        int edad = 60;

        if (edad <= 3){
            System.out.println("Bebe");
        } else if (edad <= 14){
            System.out.println("Nen");
        } else if (edad <= 25){
            System.out.println("Jove");
        } else{
            System.out.println("Adult");
        }
    }
}