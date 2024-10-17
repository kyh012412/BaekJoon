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

        int n = Integer.parseInt(br.readLine());
        boolean[] isE;

        while(n-->0) {
            int target=Integer.parseInt(br.readLine());
            int count = 0;
            int ch=0;

            isE= new boolean[10];

            while(target>0) {
                int last = target%10;
                if(!isE[last]) {
                    count++;
                    isE[last]=true;
                }
                target /= 10;
            }

            bw.write(count+"\n");
        }

        bw.close();
        br.close();
    }
}