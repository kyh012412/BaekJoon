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
        int ta = Integer.parseInt(st.nextToken());
        int tb = Integer.parseInt(st.nextToken());

        int a,b,c,d,q,r;
        a = 100-ta;
        b = 100-tb;
        c = 100-(a+b);
        d = a*b;
        q = d/100;
        r = d%100;
        bw.write(a+" "+b+" "+c+" "+d+" "+q+" "+r);
        bw.newLine();
        bw.write((c+q)+" "+r);

        br.close();
        bw.close();
    }
}