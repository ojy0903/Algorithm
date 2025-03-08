import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[][] graph = new int[1001][1001];
    private static int N;
    private static int M;
    private static boolean[] visited = new boolean[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            String str2 = br.readLine();
            st = new StringTokenizer(str2);
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (visited[i] == false) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    private static void dfs(int idx) {
        if (visited[idx] == true) {
            return;
        } else {
            visited[idx] = true;
            for (int i = 1; i <= N; i++) {
                if (graph[idx][i] == 1) {
                    dfs(i);
                }
            }
        }
    }

}