package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Quiz2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] lines = new String[N];
        Arrays.setAll(lines, i -> " ".repeat(N-i-1)+"*".repeat(i+1));
        for (int i = 0; i < lines.length; i++) {
            bufferedWriter.write(lines[i]);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
