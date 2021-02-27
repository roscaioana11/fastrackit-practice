package ro.fastrackit.classroom.exercises;

public class Metoda3Pahare { //am schimbat valorile intre a si b (Pahar1 si Pahar2) folosind c(Pahar3)
    public static void main(String[] args) {
        String Pahar1 = "Lichid verde";
        String Pahar2 = "Lichid rosu";

        //c=a, a=b, b=c
        String Pahar3 = new String(Pahar1); //iau valoarea lui Pahar1 dar creez un obiect nou
        Pahar1 = new String(Pahar2);
        Pahar2 = new String(Pahar3);
        System.out.println(Pahar1);
        System.out.println(Pahar2);
    }
}
