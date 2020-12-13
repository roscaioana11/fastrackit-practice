package ro.fastrackit.classroom.c10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        while (n > 0){
            n--;
            list.add(scan.nextInt());
        }
        int result = pickingNumbers(list);
        System.out.println(result);
    }

    public static int pickingNumbers(List<Integer> a) {
        int frequency[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int index=a.get(i);
            frequency[index]++; //frequency[index]=frequency[index]+1
        }

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }
        return result;
    }

}

