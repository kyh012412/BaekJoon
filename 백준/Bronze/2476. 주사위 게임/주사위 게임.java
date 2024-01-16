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

        int n= Integer.parseInt(br.readLine());

        int ans=0;
        int arr[]=new int[3];

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int value = 0;
            Arrays.sort(arr);
            if(arr[0]==arr[1] && arr[1] == arr[2]) {
                value= 10000+arr[0]*1000;
            }else if(arr[0] == arr[1] || arr[1] == arr[2]) {
                value = 1000+arr[1]*100;
            }else {
                value = arr[2]*100;
            }
            if(ans<value) {
                ans = value;
            }
        }

        bw.write(ans+"");

        br.close();
        bw.close();
    }
}