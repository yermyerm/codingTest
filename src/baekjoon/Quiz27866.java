package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        int i = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        String[] wordArray = word.split("");
        System.out.println(wordArray[i-1]);
    }
}
