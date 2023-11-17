package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2753 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine());

        if (year % 400 == 0) {
            System.out.println(1);
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
