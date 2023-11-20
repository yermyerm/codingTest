package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Quiz11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfNumbers = Integer.parseInt(bufferedReader.readLine());
        String numbers = bufferedReader.readLine();
        String[] numbersArray = numbers.split("");
        bufferedReader.close();

        int[] numbersArrayInt = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            numbersArrayInt[i] = Integer.parseInt(numbersArray[i]);
        }

        System.out.println(Arrays.stream(numbersArrayInt).sum());
    }
}
