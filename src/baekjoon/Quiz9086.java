package baekjoon;

import java.io.*;

public class Quiz9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfCases = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < numberOfCases; i++) {
            String word = bufferedReader.readLine();
            String[] wordArray = word.split("");
            bufferedWriter.write(wordArray[0] + wordArray[wordArray.length - 1]);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
