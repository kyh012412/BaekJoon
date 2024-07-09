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

        int a,b,c;
        a= Integer.parseInt(st.nextToken());
        b= Integer.parseInt(st.nextToken());
        c= Integer.parseInt(st.nextToken());

        if(a+b==c) {
            bw.write(a+"+"+b+"="+c);
        }else if(a-b==c) {
            bw.write(a+"-"+b+"="+c);
        }else if(a*b==c) {
            bw.write(a+"*"+b+"="+c);
        }else if(a/b==c && a%b==0) {
            bw.write(a+"/"+b+"="+c);
        }else if(a==b+c) {
            bw.write(a+"="+b+"+"+c);
        }else if(a==b-c) {
            bw.write(a+"="+b+"-"+c);
        }else if(a==b*c) {
            bw.write(a+"="+b+"*"+c);
        }else if(a==b/c && b%c==0) {
            bw.write(a+"="+b+"/"+c);
        }

        br.close();
        bw.close();
    }
}