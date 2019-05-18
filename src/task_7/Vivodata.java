package task_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vivodata {
    public static void main(String[] args) throws IOException {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(buf.readLine());
            int X = 6;
            int Y = 5;
            int Z = 9;
            if (T == X || T == Y || T == Z)
                System.out.println("Данное значение имеется вконстантах");
            else System.out.println("Такой константы нет!");
        }
    }


