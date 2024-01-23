import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            int t = Integer.parseInt(br.readLine()); 
            String str = Integer.toString(t,2);
            for(int j=str.length()-1;j>=0;j--) {
                if(str.charAt(j)=='1') {
                    bw.write(str.length()-1-j+" ");
                }
            }
            bw.newLine();           
        }

        br.close();
        bw.close();
    }
}