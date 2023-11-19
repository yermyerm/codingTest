package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer condition = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(condition.nextToken());
        int M = Integer.parseInt(condition.nextToken());
        int[] baskets = new int[N];
        for (int i = 0; i < M; i++) {
            StringTokenizer manipulator = new StringTokenizer(bufferedReader.readLine());
            int fromBasket = Integer.parseInt(manipulator.nextToken());
            int toBasket = Integer.parseInt(manipulator.nextToken());
            int ballNumber = Integer.parseInt(manipulator.nextToken());
            for (int j = fromBasket; j<=toBasket; j++) {
                baskets[j-1] = ballNumber;
            }
        }
        for (int k = 0; k < N; k++) {
            bufferedWriter.write(baskets[k]+" ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
