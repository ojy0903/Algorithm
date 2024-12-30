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
        int K = Integer.parseInt(st.nextToken());

        int kFac = 1;
        for (int i = 2; i <= K; i++) {
            kFac *= i;
        }

        int temp = 1;
        for (int i = N; i > N - K; i--) {
            temp *= i;
        }

        int ans = temp / kFac;
        System.out.println(ans);
    }
}