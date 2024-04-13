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

        int a[] = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<5;i++) {
            a[i] =Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int ans=a[2];
        outer:while(true) {
            int count=0;
            for(int i=0;i<5;i++) {
                if(ans%a[i]==0) {
                    count++;
                    if(count>=3) {
                        break outer;
                    }
                }else if(4-i+count<3){
                    ans++;
                    continue outer;
                }
            }
            System.out.println("error");
        }

        bw.write(ans+"");

        br.close();
        bw.close();
    }
}