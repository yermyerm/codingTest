import java.io.*;
import java.util.StringTokenizer;

public class Main {
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