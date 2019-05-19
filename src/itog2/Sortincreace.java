package itog2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sortincreace {

    public static void printb(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static int[] getArray(int size, BufferedReader buf) throws IOException {
        int array[] = new int[size];
        while (size > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(buf.readLine());
                size--;
            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(buf.readLine());
        int[] array = getArray(size, buf);
        sortArray(array);
        printb(array);
    }
}


