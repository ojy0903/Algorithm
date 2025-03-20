import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static int M;
    private static Queue<Integer> queue = new LinkedList<>();
    private static int[] check = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if (N == M) {
            System.out.println(0);
        } else {
            solve(N);
        }

    }

    private static void solve(int num) {

        queue.add(num);
        check[num] = 1;

        while (!queue.isEmpty()) {

            int temp = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }

                if (next == M) {
                    System.out.println(check[temp]);
                    return;
                }

                if (next >= 0 && next < check.length && check[next] == 0) {
                    queue.add(next);
                    check[next] = check[temp] + 1;
                }
            }
        }
    }


    /**
     * 실패...
     * Queue 에 가능한 값을 넣어가며 BFS 로 풀어보려 했으나
     * 언제 count 를 통해 시간을 증가시킬지를 확정하지 못함
    private static void solve() {

        int n = N;
        int count = 0;
        queue.offer(n);

        while (!queue.isEmpty()) {

            int num = queue.poll();

            if (num == M) {
                count++;
                System.out.println(count);
                break;
            }

            if (num > M) {
                queue.offer(num + 1);
                queue.offer(2 * num);
            } else {
                queue.offer(num - 1);
                queue.offer(num + 1);
                queue.offer(2 * num);
            }

        }
    }
     */

}
