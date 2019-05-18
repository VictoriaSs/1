package task_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_6 {
        public static void main(String[] args) throws IOException {
            int count = 1;
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(String.format("Введите %d число", count++));
            int x = Integer.parseInt(buf.readLine());
            System.out.println(String.format("Введите %d число", count++));
            int y = Integer.parseInt(buf.readLine());
            System.out.println(String.format("Введите %d число", count));
            int z = Integer.parseInt(buf.readLine());
            int avg = (x + y + z) / 3;

            System.out.print("Среднее арифметическое: ");
            System.out.println(avg);
            System.out.println(String.format("Если делим среднее арифметическое" +
                    " на 2, то получаем %d", avg / 2));
            if (avg > 3)
                System.out.println("Программа выполнена корректно");
            buf.close();
        }
    }

