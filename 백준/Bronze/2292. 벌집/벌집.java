import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int ans = 1;
        int i = 1;
        int count = 0;

        while (true) {

            if (input == 1) {
                System.out.println(1);
                break;
            }

            if (input <= i) {
                System.out.println(ans);
                break;
            }

            count +=6;
            i += count;
            ans++;

        }

    }
}