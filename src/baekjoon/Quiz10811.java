package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer conditions = new StringTokenizer(bufferedReader.readLine());
        int numberOfBaskets = Integer.parseInt(conditions.nextToken());
        int numberOfManipulations = Integer.parseInt(conditions.nextToken());
        int[] baskets = new int[numberOfBaskets];
        Arrays.setAll(baskets, i -> i + 1);

        for (int i = 0; i < numberOfManipulations; i++) {
            StringTokenizer manipulations = new StringTokenizer(bufferedReader.readLine());
            int basketFrom = Integer.parseInt(manipulations.nextToken());
            int basketTo = Integer.parseInt(manipulations.nextToken());

            for (int j = 0; j < basketTo - basketFrom; j++) {
                if (basketFrom - 1 + j < basketTo - 1 - j) {
                    int tmp = baskets[basketFrom - 1 + j];
                    baskets[basketFrom - 1 + j] = baskets[basketTo - 1 - j];
                    baskets[basketTo - 1 - j] = tmp;
                }
            }
        }

        for (int basket : baskets) {
            bufferedWriter.write(basket + " ");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
