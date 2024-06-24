import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 최고-최저 *2 = > 정답

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            int m = Integer.parseInt(br.readLine());
            String v[] = br.readLine().split(" ");
            int arr[] = new int[m];
            for(int j=0;j<v.length;j++) {
                arr[j] = Integer.parseInt(v[j]);
            }

            Arrays.sort(arr);
            bw.write((arr[v.length-1]-arr[0])*2+"\n");
        }

        br.close();
        bw.close();
    }
}