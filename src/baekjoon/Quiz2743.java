package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        String[] wordArray = word.split("");
        System.out.println(wordArray.length);
    }
}
