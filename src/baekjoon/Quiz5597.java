package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Quiz5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int numberOfStudents = 30;
        int[] students = new int[numberOfStudents];
        Arrays.setAll(students, i -> i + 1);

        for (int i = 0; i < 30; i++) {
            String newLine;
            while ((newLine = bufferedReader.readLine()) != null) {
                int studentNumber = Integer.parseInt(newLine);
                students[studentNumber - 1] = 0;
            }
        }
        for (int j = 0; j < 30; j++) {
            if (students[j] != 0) {
                System.out.println(students[j] + "");
            }
        }
    }
}
