import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        numbers = new int[N + 1];

        String nums = br.readLine();
        st = new StringTokenizer(nums);

        /*
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
         */

        //누적합 이용하기
        numbers[0] = 0;
        for (int i = 1; i <= N; i++) {
            numbers[i] = numbers[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            String range = br.readLine();
            st = new StringTokenizer(range);

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            //System.out.println(solve(start, end));

            System.out.println((numbers[end] - numbers[start - 1]));
        }
    }
    
    /* 단순 덧셈 => 시간초과
    private static int solve(int start, int end) {

        if (start == end) {
            return numbers[start - 1];
        }

        if (end - start == 1) {
            return numbers[start - 1] + numbers[end - 1];
        }

        int arr_st = start - 1;
        int arr_end = end - 1;
        int sum = 0;


        for (int i = arr_st; i <= arr_end; i++) {
            sum += numbers[i];
        }


        while (arr_st < arr_end) {
            sum += numbers[arr_st] + numbers[arr_end];
            arr_st++;
            arr_end--;
        }

        if (arr_end - arr_st % 2 == 0) {
            int num = arr_st + arr_end / 2;
            sum += numbers[num];
            return sum;
        } else {
            return sum;
        }
    }
     */
}