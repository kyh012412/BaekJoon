import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int tc = Integer.parseInt(br.readLine());
        
        for(int tci=0; tci<tc;tci++) {
        	int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder(n+"");
            sb = sb.reverse();
            int b = Integer.parseInt(sb.toString());
            
            n +=b ;
            
            sb.setLength(0);
            sb.append(n);
            
            if(sb.toString().equals(sb.reverse().toString())) {
            	bw.write("YES\n");
            }else {
            	bw.write("NO\n");
            }
        }
        br.close();
        bw.close();
    }
}