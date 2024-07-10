import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a[] = new int[3];

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++) {
                a[j]= Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);

            if(a[0]*a[0]+a[1]*a[1]==a[2]*a[2]) {
                bw.write("Scenario #"+(i+1)+":\nyes\n");
            }else {
                bw.write("Scenario #"+(i+1)+":\nno\n");
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}