import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        double val = (1.0)*a*(100-b)*0.01;
//      System.out.println(val);

        bw.write((val<100?1:0)+"");

        br.close();
        bw.close();
    }
}