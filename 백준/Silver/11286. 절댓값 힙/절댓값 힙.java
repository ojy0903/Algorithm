import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                if (Math.abs(num1) > Math.abs(num2)) {
                    return Math.abs(num1) - Math.abs(num2);

                } else if (Math.abs(num1) == Math.abs(num2)) {
                    return num1 - num2;

                } else {
                    return -1;
                }
            }
        });

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (queue.isEmpty()) {
                    bw.write("0\n");

                } else {
                    bw.write(queue.poll() + "\n");

                }
            } else {
                queue.offer(num);

            }
        }

        bw.flush();
        bw.close();
    }
}