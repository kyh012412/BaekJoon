import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int getAn(int n) {
		return 3*n*n-3*n+1;
	}
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        
        int n=1;
        while(true) {
        	
        	if(input<=getAn(n)) {
        		break;
        	}
        	n++;
        }
        bw.write(n+"");

        br.close();
        bw.close();
    }
}