package Task_5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Table {
    public static void main(String[] args) throws IOException {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int numb=Integer.parseInt(buf.readLine());
        System.out.format("%d * %d = %d",numb,1,numb*1);
        System.out.println();
        System.out.format("%d * %d = %d",numb,2,numb*2);
        System.out.println();
        System.out.format("%d * %d = %d",numb,3,numb*3);
        System.out.println();
        System.out.format("%d * %d = %d",numb,4,numb*4);
        System.out.println();
        System.out.format("%d * %d = %d",numb,5,numb*5);
        System.out.println();
        System.out.format("%d * %d = %d",numb,6,numb*6);
        System.out.println();
        System.out.format("%d * %d = %d",numb,7,numb*7);
        System.out.println();
        System.out.format("%d * %d = %d",numb,8,numb*8);
        System.out.println();
        System.out.format("%d * %d = %d",numb,9,numb*9);
        System.out.println();
    }
}
