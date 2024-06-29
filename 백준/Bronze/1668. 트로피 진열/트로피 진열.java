import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int a [] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int f=0;
        int b=0;

        int cv=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]>cv) {
                cv=a[i];
                f++;
            }
        }

        cv= 0;
        for(int i=a.length-1;i>=0;i--) {
            if(a[i]>cv) {
                cv=a[i];
                b++;
            }
        }

        bw.write(f+"\n"+b);

        br.close();
        bw.close();
    }
}