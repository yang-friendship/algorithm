package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1453 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] flags = new boolean[100+1];
        int cnt = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            int target = Integer.parseInt(numbers[i]);
            if (!flags[target]){
                flags[target] = true;
            }else {
                result++;
            }
        }
        System.out.println(result);
    }

}
