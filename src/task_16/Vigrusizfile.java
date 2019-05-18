package task_16;

import java.io.*;
import java.util.Scanner;

public class Vigrusizfile {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String point = buf.readLine();
        buf.close();
        FileInputStream file = new FileInputStream(point);
//        String strLine = "";
//        BufferedReader buf2 = new BufferedReader(new InputStreamReader(file));
//        while ((strLine = buf2.readLine()) != null) {
//            System.out.println(strLine);
//        }

        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String a = sc.next();
            System.out.println(a);
        }

    }


}

