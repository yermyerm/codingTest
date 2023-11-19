package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int totalPayment = Integer.parseInt(bufferedReader.readLine());
        int number = Integer.parseInt(bufferedReader.readLine());
        int total = 0;
        for (int i = 0; i < number; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int price = Integer.parseInt(stringTokenizer.nextToken());
            int count = Integer.parseInt(stringTokenizer.nextToken());
            total += price * count;
        }
        if (totalPayment == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
