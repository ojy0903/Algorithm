import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int floor = Integer.parseInt(br.readLine());
            int num = Integer.parseInt(br.readLine());
            int ans = DP(floor, num);
            System.out.println(ans);
        }
    }

    public static int DP(int floor, int num) {
        //degenerate case
        if (floor == 0) {
            return num;
        }

        if (num == 1) {
            return 1;
        }

        //recursive
        return DP(floor - 1, num) + DP(floor, num - 1);
    }

}