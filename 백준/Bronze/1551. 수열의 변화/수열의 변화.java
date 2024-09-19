import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int[] getNextA(int[] before) {
        int[] newa = new int[before.length-1];
        for(int i=0;i<newa.length;i++) {
            newa[i] = before[i+1]-before[i];
        }

        return newa;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int a[] = new int[n];
        st = new StringTokenizer(br.readLine(),",");

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        while(k-->0) {
            a = getNextA(a);
        }

        for(int i=0;i<a.length;i++) {
            if(i!=0) {
                ans.append(",");
            }
            ans.append(a[i]);
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}