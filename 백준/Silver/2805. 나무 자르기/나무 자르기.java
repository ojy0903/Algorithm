import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static int M;
    private static int[] trees;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        trees = new int[N];

        int min = 0;
        int max = 0;


        String treeStr = br.readLine();
        st = new StringTokenizer(treeStr);

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());

            if (max < trees[i]) {
                max = trees[i];
            }
        }

        //Arrays.sort(trees); //오름차순


        solve(min, max);
    }

    private static void solve(int min, int max) {

        //이분탐색
        while (min < max) {

            int mid = (min + max) / 2;
            long sum = 0;
            for (int tree : trees) {

                if (tree - mid > 0) { //중간값에서 나무 길이 뺀 값이 양수일때만
                    sum += (tree - mid); //잘라서 얻어낸 나무 길이를 sum 에 더함.
                }
            }

            if (sum < M) { //더한 값이 요구하는 값보다 작으면
                max = mid; //상한을 줄인다
            } else { //더한 값이 요구하는 값보다 크면
                min = mid + 1; //하한을 올린다.
            }
        }

        System.out.println(min - 1);
    }

    /**
     * 시간초과 발생
     * 나무 길이 중 가장 큰 값을 max 로 잡고 1씩 낮춰가며 요구하는 M 값을 얻을 수 있는지 확인
     * 배열을 전체 다 돌아야 해서 시간초과 나는듯? or 이중 반복이라 그런가...
     */
    /*
    private static int solve() {
        int max = trees[trees.length - 1];

        while (max >= 0) {

            int sum = 0;

            for (int i = trees.length - 1; i >= 0; i--) {
                if (trees[i] - max <= 0) {
                    continue;
                } else {
                    sum += trees[i] - max;
                }
            }

            if (sum == M) {
                break;
            } else {
                max--;
            }
        }

        return max;
    }

     */
}