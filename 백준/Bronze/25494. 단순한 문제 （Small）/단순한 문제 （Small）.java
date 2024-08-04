import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int getVal(String v[]) {        
        int count=0;
        for(int i=1;i<Integer.parseInt(v[0])+1;i++) {
            for(int j=1;j<Integer.parseInt(v[1])+1;j++) {
                int remain1 = i%j;
                for(int k=1;k<Integer.parseInt(v[2])+1;k++) {
                    int remain2 = j%k;
                    if(remain1!=remain2) {
                        continue;
                    }
                    int remain3 = k%i;
                    if(remain2!=remain3) {
                        continue;
                    }
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            bw.write(getVal(br.readLine().split(" "))+"\n");
        }        

        br.close();
        bw.close();
    }
}  