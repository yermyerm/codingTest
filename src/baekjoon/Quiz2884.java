package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz2884 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int hour = Integer.parseInt(stringTokenizer.nextToken());
        int minute = Integer.parseInt(stringTokenizer.nextToken());

        if (minute >= 45) {
            System.out.printf("%d %d", hour, minute - 45);
        } else if (hour != 0) {
            System.out.printf("%d %d", hour - 1, minute + 15);
        } else {
            System.out.printf("%d %d", hour + 23, minute + 15);
        }
    }
}
