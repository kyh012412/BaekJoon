import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a,b;
        a=b=0;
        
        int tempa,tempb;
        StringTokenizer st;
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	tempa = Integer.parseInt(st.nextToken());
        	tempb = Integer.parseInt(st.nextToken());
        	if(tempa>tempb) {
        		a++;
        	}else if(tempb>tempa) {
        		b++;
        	}
        }
        bw.write(a+" "+b);

        br.close();
        bw.close();
    }
}