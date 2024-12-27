import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals("0")) {
                break;
            } else {
                char[] inputArr = str.toCharArray();
                char[] temp = new char[inputArr.length];
                for (int i = 0; i < inputArr.length; i++) {
                    temp[i] = inputArr[inputArr.length - 1 - i];
                }

                String original = Arrays.toString(inputArr);
                String reverse = Arrays.toString(temp);
                if (original.equals(reverse)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}