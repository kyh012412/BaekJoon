import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			String vals[] = str.split(" ");
			int v[] = new int[6];
			int x=-1000,y=-1000;

			for(int i=0;i<6;i++) {
				v[i] = Integer.parseInt(vals[i]);
			}
			
			
			v[1]*=v[3];
			v[2]*=v[3];
			v[4]*=v[0];
			v[5]*=v[0];
			
			y = (v[5]-v[2])/(v[4]-v[1]); 
			
			for(int i=0;i<6;i++) {
				v[i] = Integer.parseInt(vals[i]);
			}
			if(v[0]!=0) {
				x = (-v[1]*y+v[2])/v[0];
			}else if(v[3]!=0) {
				x = (-v[4]*y+v[5])/v[3];
			}
			bw.write(x+" "+y);
			bw.flush();
			br.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}