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
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            while(st.hasMoreTokens()) {
                switch(st.nextToken()) {
                case "@":
                    num*=3;
                    break;  
                case "%":
                    num+=5;
                    break;  
                case "#":
                    num-=7;
                    break;              
                }
            }
            sb.append(String.format("%.2f", num)+"\n");
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}