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

        String str = br.readLine();
        int n = str.length();

        int r=-1,c=-1;

        for(int i=(int)Math.sqrt(n);i>=1;i--) {
            if(n%i==0) {
                r=i;
                c=n/r;
                break;
            }
        }

        char cr[][] = new char[r][c];
        int index=0;
        for(int i=0;i<c;i++) {
            for(int j=0;j<r;j++) {
                cr[j][i] = str.charAt(index++); 
            }
        }

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                ans.append(cr[i][j]); 
            }
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}