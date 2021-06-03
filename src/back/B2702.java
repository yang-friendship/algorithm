package back;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class B2702 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            String[] numbersAsStr = br.readLine().split(" ");
            int a = Integer.parseInt(numbersAsStr[0]);
            int b = Integer.parseInt(numbersAsStr[1]);

            int gcd = gcd(a , b);
            int lcm = lcm(a,b);
            System.out.println(lcm + " " + gcd);
        }

    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcd(b , a % b);
    }

}
