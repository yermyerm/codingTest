package baekjoon;

import java.io.*;

public class Quiz2588 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberFirst = Integer.parseInt(bufferedReader.readLine());
        String numberSecond = bufferedReader.readLine();

        System.out.println(numberFirst * (numberSecond.charAt(2) - '0'));
        System.out.println(numberFirst * (numberSecond.charAt(1) - '0'));
        System.out.println(numberFirst * (numberSecond.charAt(0) - '0'));
        System.out.println(numberFirst * Integer.parseInt(numberSecond));
    }
}
