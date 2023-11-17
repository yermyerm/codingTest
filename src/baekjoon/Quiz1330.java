package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz1330 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
        int numberFirst = Integer.parseInt(stringTokenizer.nextToken());
        int numberSecond = Integer.parseInt(stringTokenizer.nextToken());

        if (numberFirst > numberSecond) {
            System.out.println(">");
        } else if (numberFirst == numberSecond) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }
}
