package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz2480 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberFirst = Integer.parseInt(stringTokenizer.nextToken());
        int numberSecond = Integer.parseInt(stringTokenizer.nextToken());
        int numberThird = Integer.parseInt(stringTokenizer.nextToken());
        int[] numberArray = {numberFirst, numberSecond, numberThird};

        if (numberFirst == numberSecond && numberSecond == numberThird) {
            System.out.println(10000 + numberFirst * 1000);
        } else if (numberFirst == numberSecond || numberFirst == numberThird) {
            System.out.println(1000 + numberFirst * 100);
        } else if (numberSecond == numberThird) {
            System.out.println(1000 + numberSecond * 100);
        } else {
            System.out.println(Arrays.stream(numberArray).max().getAsInt() * 100);
        }
    }
}
