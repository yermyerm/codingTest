package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String letter = bufferedReader.readLine();
        int letterAscii = letter.charAt(0);
        System.out.println(letterAscii);
    }
}
