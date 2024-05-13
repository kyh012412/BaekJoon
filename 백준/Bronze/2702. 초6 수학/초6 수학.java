import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int tci=0;tci<tc;tci++) {           
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());

            int lcm = Math.max(a, b);

            while(true) {
                if(lcm%a==0 && lcm%b==0) {
                    break;
                }
                lcm++;
            }

            int gcd = Math.min(a,b);

            while(true) {
                if(a%gcd==0 && b%gcd==0) {
                    break;
                }
                gcd--;
            }
            sb.append(lcm+" "+gcd);

            sb.append("\n");
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}