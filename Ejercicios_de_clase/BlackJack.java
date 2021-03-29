package org.ieszadinvergeles.juegosdecartas;

public class blackJack {
    int[] rangoNaipe = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    String[] paloNaipe = { "Picas", "Corazones", "Treboles", "Diamantes" };

    System.out.print(getName(paloNaipe[1]))
    /*
    // El constructor de la clase
    public static carta(int rangoNaipe, String paloNaipe){
        
    }

    // Devuelve el palo de la carta
    public static paloNaipe(int[] paloNaipe){

    }
    
    // Devuelve el rango de la carta
    
    public static rangoNaipe(String[] paloNaipe, int[] rangoNaipe){
        
    }
    
    public static void baraja() {

    }
    
    // Compara la carta pasada por parámetro y devolverá true si las cartas son
    // iguales.
    public boolean equals(carta carta) {

    }
    */
    // Devuelve el nombre del palo. - FUNCIONA
    public String getName(String[] paloNaipe) {
        if (paloNaipe[0]) {
            return "Picas";
        }
        if (paloNaipe[1]) {
            return "Corazones";
        }
        if (paloNaipe[2]) {
            return "Treboles";
        }
        if (paloNaipe[3]) {
            return "Diamantes";
        }
    }
}