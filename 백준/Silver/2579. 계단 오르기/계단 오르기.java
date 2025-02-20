import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] stairs;
    private static Integer[] dp_arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        stairs = new int[N + 1];
        dp_arr = new Integer[N + 1];

        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(br.readLine());
            stairs[i] = num;
        }

        dp_arr[0] = stairs[0];
        dp_arr[1] = stairs[1];

        if (N >= 2) {
            dp_arr[2] = stairs[1] + stairs[2];
        }

        System.out.println(DP(N));
    }

    private static int DP(int n) {

        if (dp_arr[n] == null) {
            dp_arr[n] = Math.max(DP(n - 2), DP(n - 3) + stairs[n - 1]) + stairs[n];
        }

        return dp_arr[n];
    }
}