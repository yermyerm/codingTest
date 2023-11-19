package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer input1 = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(input1.nextToken());
        int X = Integer.parseInt(input1.nextToken());
        StringTokenizer input2 = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(input2.nextToken());
            if (number < X) {
                bufferedWriter.write(number+" ");
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
