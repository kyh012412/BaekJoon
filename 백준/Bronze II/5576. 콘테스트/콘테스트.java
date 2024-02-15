import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a[] = new int[2];
        int b[] = new int[10];
      
        for(int i=0;i<2;i++) {
        	for(int j=0;j<10;j++) {
        		b[j] = Integer.parseInt(br.readLine());
        		
        	}   
        	Arrays.sort(b);
        	a[i] += b[9];
        	a[i] += b[8];
        	a[i] += b[7];
        }
        bw.write(a[0]+" "+a[1]);

        br.close();
        bw.close();
    }
}