package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String numbers = bufferedReader.readLine();
        StringTokenizer number = new StringTokenizer(numbers);
        int v = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int numberI = Integer.parseInt(number.nextToken());
            if (numberI == v) {
                count += 1;
            }
        }
        System.out.println(count+"");
    }
}
