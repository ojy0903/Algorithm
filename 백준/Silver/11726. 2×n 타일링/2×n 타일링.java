import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Integer[] dp_Arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(DP(N));
    }

    private static int DP(int n) {

        dp_Arr = new Integer[n + 1];
        dp_Arr[0] = 1;
        dp_Arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp_Arr[i] = (dp_Arr[i - 1] + dp_Arr[i - 2]) % 10007;
        }

        return dp_Arr[n];
    }
}