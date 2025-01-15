import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i] = new Point(x, y);
        }

        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.Y == p2.Y) {
                    return p1.X - p2.X;
                } else {
                    return p1.Y - p2.Y;
                }
            }
        });

        for (Point point : points) {
            System.out.println(point);
        }
    }

    static class Point {
        private int X;
        private int Y;

        public Point(int x, int y) {
            X = x;
            Y = y;
        }

        @Override
        public String toString() {
            return this.X + " " + this.Y;
        }
    }
}