import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        arr = new long[num + 1];

        for (int i = 0; i < num + 1; i++) {
            arr[i] = -1;
        }

        arr[0] = 0;
        arr[1] = 1;
        System.out.println(DP(num));
    }

    public static long DP (int num) {
        if (arr[num] == -1) {
            arr[num] = DP(num - 1) + DP(num - 2);
        }
        return arr[num];
    }
}