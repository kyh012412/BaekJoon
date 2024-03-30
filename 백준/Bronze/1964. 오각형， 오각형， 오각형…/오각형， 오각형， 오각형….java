import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        n--;
        n%=45678;
        
        long ans = ((n*(n+1)/2)%45678)*3+4*n+5;
        ans %=45678;
        
        bw.write(ans+"");
       
        br.close();
        bw.close();
    }
}  