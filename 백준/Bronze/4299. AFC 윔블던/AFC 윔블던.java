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

        int hap = Integer.parseInt(st.nextToken());
        int ca = Integer.parseInt(st.nextToken());
        

        int big = (hap+ca);
        int small = (hap-ca);

        if(big%2==1 || small%2==1 || big<0 || small<0 || big<small) {
        	bw.write("-1");
        	bw.close();
        	return;
        }

        bw.write(big/2+" "+small/2);

        br.close();
        bw.close();
    }
}