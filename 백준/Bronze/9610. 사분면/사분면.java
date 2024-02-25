import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int q[] = new int[6];
        
        for(int i=1;i<n+1;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	if(a==0 || b==0) {
        		q[5]++;
        	}else if(a>0) {
        		if(b>0) {
        			q[1]++;
        		}else if(b<0){
        			q[4]++;
        		}
        	}else if(a<0){
        		if(b>0) {
        			q[2]++;
        		}else if(b<0) {
        			q[3]++;
        		}
        	}
        }
        
        for(int i=1;i<5;i++) {
        	bw.write("Q"+i+": "+q[i]+"\n");
        }
        bw.write("AXIS: "+q[5]);
        
        br.close();
        bw.close();
    }
}