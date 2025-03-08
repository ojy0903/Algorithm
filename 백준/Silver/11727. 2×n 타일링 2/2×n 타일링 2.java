import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Integer[] dp_arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp_arr = new Integer[N + 2];

        dp_arr[0] = 0;
        dp_arr[1] = 1;
        dp_arr[2] = 3;

        int ans = DP(N);
        System.out.println(ans);
    }

    private static int DP(int n) {

        if (n == 1) {
            return dp_arr[1];
        }

        if (n == 2) {
            return dp_arr[2];
        }

        if (dp_arr[n] == null) {
            for (int i = 3; i <= n; i++) {
                dp_arr[i] = (dp_arr[i - 1] + 2 * dp_arr[i - 2]) % 10007;
            }
        }

        return dp_arr[n];
    }
}
