import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int[] Narr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        Narr = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            Narr[i] = num;
        }

        Arrays.sort(Narr);

        int M = Integer.parseInt(br.readLine());
        String s = br.readLine();
        st = new StringTokenizer(s);


        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            int ans = Bsearch(num);
            if (ans >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static int Bsearch(int num) {
        int left = 0;
        int right = Narr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (num < Narr[mid]) {
                right = mid - 1;
            }
            else if (num > Narr[mid]) {
                left = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
