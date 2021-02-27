package ro.fastrackit.classroom.exercises;

public class Exercitiu {
    public static void main(String[] args) {


        for(int i = 0; i < 100; i++){ //pt paritate, daca restul impartirii cu 2 da 0 este par iar daca restul da 1 atunci este impar
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
            for(int j = 0; j < i+1; j++){
                System.out.print("^");
            }
            System.out.println("");
        }
    }
}


