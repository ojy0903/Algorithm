import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] time_Arr = new int[N];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            time_Arr[i] = num;
        }

        Arrays.sort(time_Arr);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                ans += time_Arr[j];
            }
        }

        System.out.println(ans);
    }
}