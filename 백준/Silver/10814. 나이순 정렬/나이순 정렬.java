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
        Member[] members = new Member[N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age, name, i);
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                return m1.age - m2.age;
                /**양의 정수이면 두 위치 바꾸기,
                 * 0이거나 음수면 그대로 두기
                 */
            }
        });

        for (Member member : members) {
            System.out.println(member);
        }
    }

    static class Member {
        private int age;
        private String name;
        private int count;

        public Member(int age, String name, int count) {
            this.age = age;
            this.name = name;
            this.count = count;
        }

        @Override
        public String toString() {
            return this.age + " " + this.name;
        }
    }
    
    /**
     *풀이 실패.. 해설참조
     */
}