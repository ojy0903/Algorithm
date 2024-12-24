import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2);

        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st2.nextToken());
        }

        int num1, num2, num3;
        int ans = 0;
        for (int i = 0; i < N - 2; i++) {
            num1 = cards[i];
            for (int j = i + 1; j < N - 1; j++) {
                num2 = cards[j];
                for (int k = j + 1; k < N; k++) {
                    num3 = cards[k];
                    if (num1 + num2 + num3 <= M && num1 + num2 + num3 > ans) {
                        ans = num1 + num2 + num3;
                    }
                }
            }
        }

        bw.write(ans + "");
        bw.flush();
        bw.close();
    }
}