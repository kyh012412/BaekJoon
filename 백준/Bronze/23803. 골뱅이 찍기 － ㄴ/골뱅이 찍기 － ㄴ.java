import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int i=0;i<n;i++) {
        	a.append("@");
        }
        for(int i=0;i<5;i++) {
        	b.append(a.toString());
        }
        
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<4*n;i++) {
        	ans.append(a.toString()+"\n");
        }
        for(int i=0;i<n;i++) {
        	ans.append(b.toString()+"\n");
        }
        bw.write(ans.toString());

        br.close();
        bw.close();
    }
}