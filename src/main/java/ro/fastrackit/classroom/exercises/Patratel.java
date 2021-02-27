package ro.fastrackit.classroom.exercises;

public class Patratel {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){

                if(i == 0){
                    System.out.print("♥");
                }else if(j == 0){
                    System.out.print("♥");
                }else if(i == 9){
                    System.out.print("♥");
                }else if(j == 9){
                    System.out.print("♥");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
