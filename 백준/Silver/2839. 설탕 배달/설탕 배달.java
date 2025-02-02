import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int ans = recursive(N, 0);
        System.out.println(ans);
    }

    private static int recursive(int N, int idx) {
        if (N % 5 == 0) {
            return idx + N / 5;
        }

        if (N < 0) {
            return -1;
        }

        return recursive(N - 3, idx + 1);
    }
}