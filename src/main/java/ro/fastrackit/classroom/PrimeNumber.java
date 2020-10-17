package ro.fastrackit.classroom;

public class PrimeNumber {
    public static void main(String[] args) {

        int num = 5; //to check if it is prime or not
        int count=0;  //check how many factors are for the particular variable

        if(num>1){  //checking if the number is greater that 1 or not,if it true then it will enter into the block
            for(int i = 1; i <= num; i++){
                if(num%i == 0)
                    count++;
            }
            if(count==2){ //if the count is not 2 or more than 2 then is not a prime number
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a Prime Number");
            }
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
