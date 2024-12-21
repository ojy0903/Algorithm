import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int ans = 1;

        while (true) {

            if (ans == input) {
                System.out.println(0);
                break;
            }

            int sum = ans;
            int temp = ans;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == input) {
                System.out.println(ans);
                break;
            }

            ans++;
        }

    }
}