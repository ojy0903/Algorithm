import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int V;
    private static int E;
    private static int[][] edge_Arr;
    private static boolean[] visited_Arr;
    private static int count;
    private static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        V = Integer.parseInt(br.readLine());

        E = Integer.parseInt(br.readLine());

        edge_Arr = new int[V + 1][V + 1];
        visited_Arr = new boolean[V + 1];

        for (int i = 0; i < E; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            edge_Arr[v1][v2] = edge_Arr[v2][v1] = 1;
        }

        BFS(1);
        System.out.println(count);
    }

    private static void BFS(int v) {
        queue.offer(v);
        visited_Arr[v] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();

            for (int i = 1; i <= V; i++) {
                if (edge_Arr[v][i] == 1 && visited_Arr[i] == false) {
                    queue.offer(i);
                    visited_Arr[i] = true;
                    count++;
                }
            }
        }
    }
}