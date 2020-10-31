package classroom.c6;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

        System.out.println("Enter the number of rows: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rows = num;
        int number;

        System.out.println("Triangle: ");
        for(int i = 0; i<num; i++){
            //nested loop for spaces
            for(int k = 1; k<= rows; k++){
                System.out.print(" ");
            }
            number = 1;
            for(int j = 0; j<= i; j++){
                System.out.print(number + " ");
                number = number * (i-j)/(j+1);
            }
            rows--;
            System.out.println();
        }
    }
}
