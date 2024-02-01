import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int total=0;
        for(int i=0;i<n;i++) {
            total += Integer.parseInt(br.readLine());
        }

        total-=(n-1);

        bw.write(total+"");

        br.close();
        bw.close();     
    }
}