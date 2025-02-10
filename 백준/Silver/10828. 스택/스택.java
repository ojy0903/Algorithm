import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            String command = st.nextToken();

            if (command.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }

            if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    Integer num = stack.pop();
                    System.out.println(num);
                }
            }

            if (command.equals("size")) {
                int size = stack.size();
                System.out.println(size);
            }

            if (command.equals("empty")) {
                int size = stack.size();
                if (size == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

            if (command.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    Integer top = stack.peek();
                    System.out.println(top);
                }
            }
        }
    }
}