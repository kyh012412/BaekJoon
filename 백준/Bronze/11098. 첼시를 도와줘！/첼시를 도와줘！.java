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
        for (int i=0; i<n;i++) {

            int nn = Integer.parseInt(br.readLine());           
            int val = -1;
            String name = null;

            for(int j=0;j<nn;j++) {
                st= new StringTokenizer(br.readLine());
                int tempval = Integer.parseInt(st.nextToken()); 
                if(j==0) {
                    val = tempval;
                    name = st.nextToken();
                    continue;
                }
                if(tempval>val) {
                    val = tempval;
                    name = st.nextToken();
                }
            }
            bw.write(name+"\n");
        }

        br.close();
        bw.close();
    }
}
