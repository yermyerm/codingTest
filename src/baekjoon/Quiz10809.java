package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Quiz10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = bufferedReader.readLine();
        bufferedReader.close();

        String[] wordArray = word.split("");
        String[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".split("");
        int[] alphabetSearch = new int[alphabetArray.length];
        Arrays.setAll(alphabetSearch, i -> -1);


        for (int i = 0; i < wordArray.length; i++) {
            int index = Arrays.binarySearch(alphabetArray, wordArray[i]);
            if (alphabetSearch[index] == -1) {
                alphabetSearch[index] = i;
            }
        }

        for (int search : alphabetSearch) {
            bufferedWriter.write(search + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
