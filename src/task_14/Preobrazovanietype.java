package task_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Preobrazovanietype {
    public static void main(String[] args) throws IOException {
        String S;
        int X;
        double Y;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        S = buf.readLine();
        double D = (Double.parseDouble(S));
        X = (int) D / 1;
        Y = X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}

