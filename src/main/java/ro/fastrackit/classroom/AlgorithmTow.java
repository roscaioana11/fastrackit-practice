package ro.fastrackit.classroom;

public class AlgorithmTow {
    public static void main(String[] args) {

        //Prime numbers
        for(int i = 1; i<=100; i++){  //the num we will evaluate= 100
            for(int j = 2; j<=i; j++){ // to find less than the written number
                if(j == i){
                    System.out.println(i);
                }
                if(i%j == 0){
                    break;
                }
            }
        }
    }
}
