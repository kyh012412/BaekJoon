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

        int tc = Integer.parseInt(br.readLine());

        while(tc-->0) {
            String str1 = br.readLine();
            String str2 = br.readLine();
            int count=0;
            for(int i=0;i<str1.length();i++) {
                count+=str1.charAt(i)!=str2.charAt(i)?1:0;
            }
            ans.append("Hamming distance is "+count+".\n");
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}