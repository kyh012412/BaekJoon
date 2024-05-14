import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static char getComparedChar(int a[],int b[],int idx) {
        if(a[idx]>b[idx]) {
            return 'A';
        }else if(a[idx]<b[idx]) {
            return 'B';
        }else if(idx==0) {
            return 'D';
        }else {
            return getComparedChar(a, b, idx-1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int tci=0;tci<tc;tci++) {       
            int a[] = new int[5];
            int b[] = new int[5];           

            StringTokenizer st = new StringTokenizer(br.readLine());

            int an = Integer.parseInt(st.nextToken());
            for(int i=0;i<an;i++) {
                int val = Integer.parseInt(st.nextToken());
                a[val]++;
            }

            st = new StringTokenizer(br.readLine());

            int bn = Integer.parseInt(st.nextToken());
            for(int i=0;i<bn;i++) {
                int val = Integer.parseInt(st.nextToken());
                b[val]++;
            }

            sb.append(getComparedChar(a, b, 4));

            sb.append("\n");
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}