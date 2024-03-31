import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String v[] = br.readLine().split(" ");
//        for(int i=0;i<v.length;i++) {
//          System.out.println(v[i]);
//        }
        int temp = Integer.parseInt(v[0])+Integer.parseInt(v[2]);

        if(v[4].equals(temp+"")) {
            bw.write("YES");
        }else {
            bw.write("NO");
        }

        br.close();
        bw.close();
    }
} 