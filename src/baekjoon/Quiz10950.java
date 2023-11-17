package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(bufferedReader.readLine());
        int i = 1;
        while (i <= test) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int numberFirst = Integer.parseInt(stringTokenizer.nextToken());
            int numberSecond = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(numberFirst + numberSecond);
            i++;
        }
    }
}
