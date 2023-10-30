public class exercici4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /* Exercici 10 - Escriu un programa en Java, utilitzant bucles, que sumi els numeros del 7 al 14 i mostri el resultat per pantalla.
        */

        int i = 0;
        int num1 = 7;
        int num2 = 8;
        int num3 = 9;
        int num4 = 10;
        int num5 = 11;
        int num6 = 12;
        int num7 = 13;
        int num8 = 14;
        int resultat = num1+num2+num3+num4+num5+num6+num7+num8;

        while (i<=6) {
            System.out.println("La suma de: "+num1+", "+num2+", "+num3+", "+num4+", "+num5+", "+num6+", "+num7+" y "+num8);
            System.out.println("Dona com a resultat: " +resultat);
        }   
    }
}
