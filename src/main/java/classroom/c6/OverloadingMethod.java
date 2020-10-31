package classroom.c6;

public class OverloadingMethod {

    public static void main(String[] args) {
        printAnything(new long[] { 1L, 2L, 3L});
        printAnything(new int[] { 1, 2, 3});
        printAnything(new Object());
        printAnything(new Double(1.0)); // Double
        printAnything("String");
        printAnything(new Long(1L)); // Long
        printAnything(1L); // long
        printAnything(1); // int
    }

    static void printAnything(int number){
        System.out.println("int: " + number);
    }

    static void printAnything(long anotherNumber){
        System.out.println("long: " + anotherNumber);
    }

    static void printAnything(Long wrappedLong){
        System.out.println("Long: " + wrappedLong);
    }

    static void printAnything(String someString){
        System.out.println("String: " + someString);
    }

    static void printAnything(Double wrappedDouble){
        System.out.println("Double: " + wrappedDouble);
    }

    static void printAnything(Object someObject){
        System.out.println("Object: " + someObject);
    }

    static void printAnything(int[] intVarArgs){
        System.out.print("int array ");
        for(int i = 0; i<intVarArgs.length; i++){
            System.out.print(intVarArgs[i] + ", ");
        }
        System.out.println();
    }

    static void printAnything(long[] longVarArgs){
        System.out.print("long array ");
        for (int i = 0; i < longVarArgs.length; i++) {
            System.out.print(longVarArgs[i] + ", ");
        }
        System.out.println();
    }
}
