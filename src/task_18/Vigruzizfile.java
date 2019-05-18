package task_18;

import java.io.*;

public class Vigruzizfile {
    public static void main(String[] args) throws IOException {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String point=buf.readLine();
        File file = new File(point);
        FileInputStream fileInputStream=new FileInputStream(file);
        String out="";
        int count=0;
        buf=new BufferedReader(new InputStreamReader(fileInputStream));
        while ((out=buf.readLine())!=null) {
            count++;
            System.out.println(out);
        }buf.close();
        String in="";
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        while (count!=0){
            in=buffer.readLine();
            bufferedWriter.write(in);
            bufferedWriter.newLine();
            count--;
        }
        buffer.close();
        bufferedWriter.close();

    }}
