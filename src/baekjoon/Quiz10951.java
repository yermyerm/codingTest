package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String string = bufferedReader.readLine();
            if (string == null) {
                break;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(string);
            int numberFirst = Integer.parseInt(stringTokenizer.nextToken());
            int numberSecond = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write((numberFirst + numberSecond) + "");
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
