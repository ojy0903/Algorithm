import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] dp_arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp_arr = new int[12];

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(DP(n));
        }
    }

    private static int DP(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        } else {
            if (dp_arr[n] == 0) {
                dp_arr[n] = DP(n - 1) + DP(n - 2) + DP(n - 3);
            }
            return dp_arr[n];
        }
    }
}