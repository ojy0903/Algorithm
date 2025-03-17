import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int N;
    private static int M;
//    private static String[] non_seen;
//    private static String[] non_heard;
//    private static String[] overlap;
//    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>(); //set 에 이름들을 넣고, set 의 contains() 를 통해 중복을 확인

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            if (set.contains(temp)) {
                result.add(temp);
            }
        }

        Collections.sort(result); //Collections.sort() 를 사용해 사전순 정렬

        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }

    /* 실패... 사전순으로 정렬 과정에서 오류
    private static void solve() {

        count = 0;
        int overCount = 0;
        if (N > M) {
            overlap = new String[N + 1];
        } else {
            overlap = new String[M + 1];
        }

        for (int i = 0; i < N; i++) {
            String name1 = non_seen[i];

            for (int j = 0; j < M; j++) {
                String name2 = non_heard[i];

                if (name1.equals(name2)) {
                    count++;
                    overlap[overCount] = name2;
                    overCount++;
                }
            }
        }

        System.out.println(count);
        Arrays.sort(overlap);
        for (String name : overlap) {
            System.out.println(name);
        }
    }
     */
}
