package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfCases = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfCases; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int repeat = Integer.parseInt(stringTokenizer.nextToken());
            String[] stringArray = stringTokenizer.nextToken().split("");
            for (String string : stringArray) {
                bufferedWriter.write(string.repeat(repeat));
            }
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
