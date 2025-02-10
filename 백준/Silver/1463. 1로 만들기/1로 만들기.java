import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Integer[] dp_Arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp_Arr = new Integer[N + 1];
        dp_Arr[0] = 0;
        dp_Arr[1] = 0;

        System.out.println(DP(N));
    }

    private static int DP(int n) {

        if (dp_Arr[n] == null) {

            if (n % 6 == 0) {
                //6으로 나눠지는 경우, (-1 하는 경우, 2로 나누는 경우, 3으로 나누는 경우) 중 최소 선택
                dp_Arr[n] = Math.min(DP(n - 1), Math.min(DP(n/3), DP(n/2))) + 1;
            } else if (n % 3 == 0) {
                //3으로 나눠지는 경우, (3으로 나누는 경우, -1 하는 경우) 중 최소 선택
                dp_Arr[n] = Math.min(DP(n/3), DP(n-1)) + 1;
            } else if (n % 2 == 0) {
                //2로 나눠지는 경우, (2로 나누는 경우, -1 하는 경우) 중 최소 선택
                dp_Arr[n] = Math.min(DP(n / 2), DP(n - 1)) + 1;
            } else {
                //2, 3으로 나눠지지 않으면, -1
                dp_Arr[n] = DP(n - 1) + 1;
            }
        }

        return dp_Arr[n];
    }
}
