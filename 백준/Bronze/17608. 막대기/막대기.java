import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int arr[] = new int[a];
        for (int i=0;i<a;i++) {
            arr[i] =Integer.parseInt(br.readLine());            
        }
        int max=0;
        int count=0;
        for(int i=a-1;i>=0;i--) {
            if(max<arr[i]) {
                max=arr[i];
                count++;
            }
        }
        bw.write(count+"");

        br.close();
        bw.close();
    }

}