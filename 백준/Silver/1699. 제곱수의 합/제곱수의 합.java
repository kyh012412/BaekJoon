import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int ar[];

    public static int getmin(int val) {
        int rt = (int)Math.sqrt(val);
        if(rt*rt == val) {
            ar[val]=1;
            return ar[val];
        }
        int min = Integer.MAX_VALUE;
        for(int i=1;i<val/2+1;i++) {
            int temp = ar[i]+ar[val-i];
            if(temp<min) {
                min=temp;                       
            }
        }
        ar[val]= min;
        return ar[val];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ar = new int[n+1];
        Arrays.fill(ar, -1);

        ar[1] = 1;
        for(int i=2;i<=n;i++) {
            ar[i] = getmin(i);
        }

        bw.write(ar[n]+"");

        bw.close();
        br.close();
    }
}