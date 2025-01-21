import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) { //큐 내부 데이터가 1개 남을때까지 반복
            queue.remove(); //제일 처음 원소 제거
            int num = queue.poll(); //2번째 원소 꺼내기
            queue.offer(num); //2번째 원소 맨 뒤에 넣기
        }

        System.out.println(queue.peek());
    }
}