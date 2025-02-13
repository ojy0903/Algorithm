import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[][] edge_Arr;
    private static boolean[] visited_Arr;
    private static int N;
    private static int M;
    private static int V;
    private static int count;
    private static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        edge_Arr = new int[1001][1001];
        visited_Arr = new boolean[1001];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            edge_Arr[v1][v2] = 1;
            edge_Arr[v2][v1] = 1;
        }

        DFS(V);
        System.out.println();

        visited_Arr = new boolean[1001];
        BFS(V);
    }

    /**
     * DFS (깊이 우선)
     * -> 시작 vertex 에 연결된 각 vertex 에 대해 DFS 호출
     */
    private static void DFS(int v) {

        visited_Arr[v] = true;
        System.out.print(v + " ");

        if (count == N) {
            return;
        }

        count++;

        for (int i = 1; i <= N; i++) {
            if (edge_Arr[v][i] == 1 && visited_Arr[i] == false) {
                DFS(i);
            }
        }
    }

    /**
     * BFS (넓이 우선)
     *  -> 시작 vertex 에 연결된 vertex 들을 queue 에 담고,
     *  -> queue 가 empty 가 될때까지 차례로 방문
     *  -> 오름차순이 기본 전략
     */
    private static void BFS(int v) {

        queue.offer(v);
        visited_Arr[v] = true;
        System.out.print(v + " ");

        while (!queue.isEmpty()) {
            v = queue.poll();

            for (int i = 1; i <= N; i++) {

                if (edge_Arr[v][i] == 1 && visited_Arr[i] == false) {
                    queue.offer(i);
                    visited_Arr[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}