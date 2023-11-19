
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        boolean arr[] = new boolean [(int)(max-min+1)];
        
        long idx=2;
        int count=(int)(max-min+1);
        while(true) {
        	long iidx = idx*idx;
    		long niidx=-1;
    		long n=(min/iidx);
        	while(true) {
        		niidx = n*iidx;
        		if(niidx>max)
            		break;
//        		System.out.println(niidx+"??");
        		if(niidx-min>=0&& niidx-min<=max-min && arr[(int)(niidx-min)]) {
        			n++;
        			continue;
        		}
        		if(niidx<min) {
        			n++;
        			continue;
        		}else if(niidx>=min && niidx<=max){
        			arr[(int)(niidx-min)] =true;
        			count--;
        			n++;
        			continue;
        		}
        	}
        	if(iidx>max) {
        		break;
        	}
        	idx++;
        }
        
        bw.write(count+"");
    
        br.close();
        bw.close();
    }
}