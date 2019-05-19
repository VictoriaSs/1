package itog1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zikli {
            public static int pow(int a, int b) {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }
        public static int binToDec(String bin){
            int res = 0, a = 0, mult = 0;
            char[] symbols = bin.toCharArray();
            for(int len = symbols.length-1; len >= 0; len--){
                int temp = 0;
                a = Character.getNumericValue(symbols[len]);
                temp = a * pow(2, mult);
                mult++;
                res += temp;
            }
            return res;
        }
        public static void main(String[] args) throws IOException {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String bin = buf.readLine();
            System.out.println(binToDec(bin));

        }}


