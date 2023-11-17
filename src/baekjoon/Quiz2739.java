package baekjoon;

import java.io.*;

public class Quiz2739 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i < 10; i++) {
            bufferedWriter.write(number + " * " + i + " = " + number * i + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
