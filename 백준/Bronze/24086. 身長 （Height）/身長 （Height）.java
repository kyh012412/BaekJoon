import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a,b;

        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        bw.write(b-a+"");

        br.close();
        bw.close();
    }
}