package task_17;

import java.io.*;

public class Zapisvfile {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String point = buf.readLine();
        File file = new File(point);
        FileWriter fileWriter = new FileWriter(file);
        String in = "";
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        System.out.println("Ввод данных прекратить написав:stop");
        while (!(in = buf.readLine()).equals("stop")) {
            bufferedWriter.write(in);
            bufferedWriter.newLine();
        }
        buf.close();
        bufferedWriter.close();
    }
}

