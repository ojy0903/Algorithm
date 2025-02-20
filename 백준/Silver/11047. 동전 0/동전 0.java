import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] coins;
    private static int count;
    private static int N;
    private static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        Greedy();
        System.out.println(count);
    }

    private static void Greedy() {
        for (int i = N - 1; i >= 0; i--) {
            if (K <= 0) {
                break;
            }
            if (coins[i] <= K) {
                count += K / coins[i];
                K = K % coins[i];
            }
        }
    }
}