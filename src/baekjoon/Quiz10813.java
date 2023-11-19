package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer conditions = new StringTokenizer(bufferedReader.readLine());
        int basketNumber = Integer.parseInt(conditions.nextToken());
        int changes = Integer.parseInt(conditions.nextToken());
        int[] baskets = new int[basketNumber];
        for (int i = 1; i <= basketNumber; i++) {
            baskets[i - 1] = i;
        }

        for (int j = 0; j < changes; j++) {
            StringTokenizer manipulator = new StringTokenizer(bufferedReader.readLine());
            int basketI = Integer.parseInt(manipulator.nextToken());
            int basketJ = Integer.parseInt(manipulator.nextToken());
            int tmp = baskets[basketI - 1];
            baskets[basketI - 1] = baskets[basketJ - 1];
            baskets[basketJ - 1] = tmp;
        }

        for (int k = 0; k < basketNumber; k++) {
            bufferedWriter.write(baskets[k] + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
