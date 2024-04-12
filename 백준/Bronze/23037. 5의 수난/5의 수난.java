import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a= Integer.parseInt(br.readLine());
        int total =0;
        while(a>0) {
            int last= a%10;
            total +=(int)Math.pow(last, 5);
            a/=10;
        }
        bw.write(total+"");

        br.close();
        bw.close();
    }
}