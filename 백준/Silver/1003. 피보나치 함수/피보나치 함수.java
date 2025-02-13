import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] one_count;
    private static int[] zero_count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        one_count = new int[41];
        zero_count = new int[41];

        one_count[0] = 0;
        one_count[1] = 1;

        zero_count[0] = 1;
        zero_count[1] = 0;

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int zero = Fib_Count_zero(n);
            int one = Fib_Count_one(n);

            System.out.println(zero + " " + one);
        }
    }

    private static int Fib_Count_zero(int n) {
        if (n == 0) {
            return zero_count[0];
        } else if (n == 1) {
            return zero_count[1];
        } else {
            if (zero_count[n] != 0) {
                return zero_count[n];
            } else {
                for (int i = 2; i <= n; i++) {
                    zero_count[i] = zero_count[i - 1] + zero_count[i - 2];
                }

                return zero_count[n];
            }
        }
    }

    private static int Fib_Count_one(int n) {
        if (n == 0) {
            return one_count[0];
        } else if (n == 1) {
            return one_count[1];
        } else {
            if (one_count[n] != 0) {
                return one_count[n];
            } else {
                for (int i = 2; i <= n; i++) {
                    one_count[i] = one_count[i - 1] + one_count[i - 2];
                }

                return one_count[n];
            }
        }
    }
}