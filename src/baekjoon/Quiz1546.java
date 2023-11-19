package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTests = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer scoreLine = new StringTokenizer(bufferedReader.readLine());
        double[] scores = new double[numberOfTests];
        Arrays.setAll(scores, i -> Integer.parseInt(scoreLine.nextToken()));
        double scoreMax = Arrays.stream(scores).max().getAsDouble();

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i] / scoreMax * 100;
        }
        System.out.println(Arrays.stream(scores).sum() / numberOfTests + "");
    }
}

