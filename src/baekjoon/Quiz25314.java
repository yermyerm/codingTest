package baekjoon;

import java.io.*;

public class Quiz25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < number / 4; i++) {
            bufferedWriter.write("long ");
        }
        bufferedWriter.write("int");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
