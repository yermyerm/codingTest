import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class $18108 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        int yearAD = Integer.parseInt(string);

        System.out.println(yearAD - 543);
    }
}
