import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        int comMul;
        int count = 1;
        while (true) {
            if (min * count % max == 0) {
                comMul = min * count;
                break;
            } else {
                count++;
            }
        }

        bw.write(gcd + "\n" + comMul);
        bw.flush();
        bw.close();
    }
}