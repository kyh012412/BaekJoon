import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String valueString = br.readLine();
			String vals[] = valueString.split(" ");
			
			int valint[] = new int [4];
			
			for(int i=0;i<4;i++) {
				valint[i] = Integer.parseInt(vals[i]);
			}
			valint[2]-=valint[0];
			valint[3]-=valint[1];
			
			int min = Math.min(Math.min(valint[1], valint[3]) , Math.min(valint[0],valint[2]));
			
			bw.write(""+min);
			bw.flush();
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}