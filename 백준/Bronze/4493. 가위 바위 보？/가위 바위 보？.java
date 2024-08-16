import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {		
	public static int a=0;
	public static int b=0;
	
	public static void cal(String str) {
		switch(str) {
			case "R P":
			case "P S":
			case "S R":
				b++;
				break;
			case "R S":
			case "S P":
			case "P R":
				a++;
				break;
		}	
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int tci=0;tci<tc;tci++) {
			int n = Integer.parseInt(br.readLine());
			a=0;
			b=0;
			for(int i=0;i<n;i++) {
				cal(br.readLine());
			}
			if(a>b) {
				bw.write("Player 1\n");				
			}else if(a<b) {
				bw.write("Player 2\n");
			}else {
				bw.write("TIE\n");
			}
		}
		
		br.close();
		bw.close();
	}
}