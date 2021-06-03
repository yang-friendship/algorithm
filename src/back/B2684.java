package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2684 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        long target = 7; // 1 1 1 비트의 숫자

        while (repeat-- > 0) {
            String input = br.readLine();
            int[] arr = new int[8];
            long bit = 1;
            for (int i = 0; i < input.length(); i++) {
                bit = bit << 1;
                if (input.charAt(i) == 'T') {
                    bit += 1;
                }
            }

            for (int i = 0; i < 38; i++) {
                int result = (int) (bit & target);
                arr[result] = arr[result] + 1;
                bit = bit >> 1;
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

}
