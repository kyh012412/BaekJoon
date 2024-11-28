import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static String getFirstWord(String a,String b) {      
        return a.compareToIgnoreCase(b)<0?a:b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {           
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            String first = br.readLine();
            for(int i=1;i<n;i++) {
                first = getFirstWord(first, br.readLine());
            }
            ans.append(first+"\n");
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}