import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        double[] grades = new double[N];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        for (int i = 0; i < N; i++) {
            grades[i] = Integer.parseInt(st.nextToken());
        }

        double max = grades[0];
        for (double grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }

        for (int i = 0; i < N; i++) {
            double temp = grades[i];
            grades[i] = (temp / max) * 100;
        }

        double avg = 0;
        for (double grade : grades) {
            avg += grade;
        }
        
        avg /= N;

        System.out.println(avg);
    }
}