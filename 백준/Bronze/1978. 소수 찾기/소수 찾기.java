import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int N = Integer.parseInt(st.nextToken());

        int[] inputs = new int[N];

        String nums = br.readLine();

        StringTokenizer st2 = new StringTokenizer(nums);

        for (int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(st2.nextToken());
        }

        int ans = 0;

        for (int num : inputs) {
            if (isPrime(num)) {
                ans++;
            }
        }

        System.out.println(ans);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
