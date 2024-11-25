import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main { 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[4];

        String v[] = br.readLine().split(" ");

        for(int i=0;i<v.length;i++) {
            arr[i] = Integer.parseInt(v[i]);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());

        int index=-1;
        for(int i=0;i<4;i++) {
            if(arr[i]==x) {
                index=i;
                break;
            }
        }

        bw.write(index+1+"");

        br.close();
        bw.close();
    }
}