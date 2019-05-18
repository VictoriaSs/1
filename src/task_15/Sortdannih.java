package task_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sortdannih {
    public static void main(String[] args) throws IOException {
        int array[] = new int[5];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(buf.readLine());
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}


