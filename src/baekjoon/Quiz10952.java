package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int numberFirst = Integer.parseInt(stringTokenizer.nextToken());
            int numberSecond = Integer.parseInt(stringTokenizer.nextToken());
            if (numberFirst == 0 && numberSecond == 0) {
                break;
            }
            bufferedWriter.write((numberFirst + numberSecond) + "");
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
