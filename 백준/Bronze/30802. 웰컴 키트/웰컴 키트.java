import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String sizes = br.readLine();
        StringTokenizer st = new StringTokenizer(sizes);
        int[] sizeNum = new int[6];
        for (int i = 0; i < 6; i++) {
            sizeNum[i] = Integer.parseInt(st.nextToken());
        }

        String set = br.readLine();
        StringTokenizer st2 = new StringTokenizer(set);
        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());

        //사이즈 세트 갯수 구하기
        int sizeSet = 0;
        for (int size : sizeNum) {
            sizeSet += size / T;
            if (size % T != 0) {
                sizeSet++;
            }
        }

        //펜 구하기
        int penSet = N / P;
        int penOne = N % P;

        bw.write(sizeSet + "\n" + penSet + " " + penOne);
        bw.flush();
        bw.close();
    }
}