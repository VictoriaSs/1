package itog_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {

        public static void main(String[] args) throws IOException {
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите текущий курс");
            double currentMood=Double.parseDouble(buf.readLine());
            System.out.println("Введите количество рублей");
            double countRuble=Double.parseDouble(buf.readLine());
            double res=currentMood*countRuble;
            BigDecimal res2=new BigDecimal(res);
            BigDecimal res3=res2.setScale(2, RoundingMode.HALF_UP);


            System.out.println("Итого: "+res3);
        }
    }


