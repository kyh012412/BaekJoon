import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        int a,b,c,d;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        int fc = a+b;
        int bc = c+d;

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            int count=0;
            if(num%fc<=a && num%fc>=1) count++;
            if(num%bc<=c && num%bc>=1) count++;
            ans.append(count+"\n");
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}
