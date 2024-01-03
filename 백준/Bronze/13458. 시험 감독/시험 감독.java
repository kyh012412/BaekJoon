import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n,arr[],b,c;
        StringTokenizer st = new StringTokenizer(br.readLine()+" "+br.readLine()+" "+br.readLine());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        b = Integer.parseInt(st.nextToken());//총감독
        c = Integer.parseInt(st.nextToken());//부감독

        //모든값이 0이하가되야함      
        //올림나눗셈필요

        long ans=0;
        for(int i=0;i<n;i++) {
            int num = arr[i]-b;
            ans++;

            if(num>0) {
                ans += (num+c-1)/c;
            }

        }

        bw.write(ans+"");       

        br.close();
        bw.close();
    }
}