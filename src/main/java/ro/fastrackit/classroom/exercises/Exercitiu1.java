package ro.fastrackit.classroom.exercises;

public class Exercitiu1 {
    static int NumarAleatoriu = 110;

    public static void numarEgalCinci(){
        NumarAleatoriu = 5;
    }

    public static void main(String[] args) {
        int NumarAleatoriu = 10;
//        System.out.println(NumarAleatoriu);
//        System.out.println(Exercitiu1.NumarAleatoriu);
        Exercitiu1.NumarAleatoriu = NumarAleatoriu;
        System.out.println(NumarAleatoriu);
        System.out.println(Exercitiu1.NumarAleatoriu);

        numarEgalCinci();
        System.out.println(NumarAleatoriu);
        System.out.println(Exercitiu1.NumarAleatoriu);
    }
}
