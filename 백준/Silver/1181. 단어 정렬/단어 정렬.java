import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                if (words[i].length() == words[j].length()) { //단어의 길이가 같을 경우,
                    if (words[i].compareTo(words[j]) > 0) { //두 단어가 사전 순에서 역순으로 되어 있으면,
                        String temp = words[j];
                        words[j] = words[i];
                        words[i] = temp; //서로 바꾸기(swap)
                    }
                } else {
                    if (words[i].length() > words[j].length()) { //길이가 더 긴 단어가 앞에 있으면,
                        String temp = words[j];
                        words[j] = words[i];
                        words[i] = temp; //서로 바꾸기(swap)
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (i != 0) { //첫번째 words 원소는 무조건 print, 두번째 원소부터는,
                if (words[i].compareTo(words[i - 1]) != 0) { //두 단어가 같지 않으면 print
                    System.out.println(words[i]);
                }
            } else {
                System.out.println(words[i]);
            }
        }
        
        //해결 실패...해설 참조 ver
    }
}