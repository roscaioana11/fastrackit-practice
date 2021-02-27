package ro.fastrackit.classroom.exercises;

public class AltExercitiu {
    public static void main(String[] args) {
        for(int i = 5; i <= 50; i++){
            if(i % 5 == 0){ //restul nu poate sa fie niciodata >= decat numarul cu care il imparti in acest caz este 5
                System.out.print(i + ", "); //println - printeaza pe linie noua / print simplu - printeaza pe aceeasi linie
            }
        }
    }
}
