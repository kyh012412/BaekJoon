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

        while(true) {
            String target = br.readLine();
            if(target.equals("0 0 0")) {
                break;
            }

            st= new StringTokenizer(target);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a+c==b+b){
                ans.append("AP "+(c+b-a)+"\n");
            }else  if(a*c == b*b) {
                ans.append("GP "+(c*b/a)+"\n");
            }
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}