package task_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int mass[][] = new int[2][2];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = Integer.parseInt(buf.readLine());
            }
        }
        for (int j = 0; j < mass.length; j++) {
            System.out.println(mass[0][j] * 3);
        }

    }
}