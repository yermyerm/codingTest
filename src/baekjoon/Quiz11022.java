package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= number; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int numberFirst = Integer.parseInt(stringTokenizer.nextToken());
            int numberSecond = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write(String.format("Case #%d: %d + %d = %d", i, numberFirst, numberSecond, numberFirst + numberSecond));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
