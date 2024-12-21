import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b, c;

        while (true) {

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            
            if (a == 0 && b == 0 && c == 0) break;

            int powA = a*a;
            int powB = b*b;
            int powC = c*c;

            if (a > b && a > c) {
                if (powA == powB + powC) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }

            if (b > a && b > c) {
                if (powB == powA + powC) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }

            if (c > b && c > a) {
                if (powC == powB + powA) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
