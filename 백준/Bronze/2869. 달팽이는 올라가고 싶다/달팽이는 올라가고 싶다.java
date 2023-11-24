import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String temp = br.readLine();
			String temps[] = temp.split(" ");
			int up = Integer.parseInt(temps[0]);
			int down = Integer.parseInt(temps[1]);;
			int target = Integer.parseInt(temps[2]);
			int daycount=0;
			
			if(up>=target) {
				bw.write("1");
				bw.flush();
				br.close();
				return;
			}else {
				target-=up;
				daycount=1;
			}
			int dd = up-down;
			daycount += (target%dd==0)?target/dd:target/dd+1;
			
			bw.write(""+daycount);
			bw.flush();
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}