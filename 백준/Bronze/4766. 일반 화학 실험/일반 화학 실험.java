import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        float before = -11;
        float target;
        StringBuilder sb = new StringBuilder();
        String input;
        while(true) {
        	input = br.readLine();
        	if(input.equals("999")){
        		break;
        	}
        	
        	if(before==-11) {
        		before=Float.parseFloat(input);
        		continue;
        	}
        	
        	target = Float.parseFloat(input);
        	sb.append(String.format("%.2f\n",target-before));
        	before = target;
        }
        
        bw.write(sb.toString());
        
        br.close();
        bw.close();
    }
}