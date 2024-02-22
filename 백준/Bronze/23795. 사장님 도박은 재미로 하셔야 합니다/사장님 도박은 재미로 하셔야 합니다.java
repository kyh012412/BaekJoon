import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum=0;
        int temp;
        while(true) {
        	temp = Integer.parseInt(br.readLine());
        	if(temp==-1) {
        		break;
        	}
        	sum+=temp;
        }
        bw.write(sum+"");
        br.close();
        bw.close();
    }

}