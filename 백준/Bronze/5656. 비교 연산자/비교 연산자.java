import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static StringBuffer ans = new StringBuffer();
	
	public static void addTrue(int index) {
		ans.append("Case ");
		ans.append(index);
		ans.append(": true\n");
	}
	
	public static void addFalse(int index) {
		ans.append("Case ");
		ans.append(index);
		ans.append(": false\n");
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str;
		int index=0;
		String v[];
		int a,b;
		String val;
		while(true) {
			v = br.readLine().split(" ");
			a = Integer.parseInt(v[0]);
			b = Integer.parseInt(v[2]);
			index++;
			
			if(v[1].equals("E")) break;
			
			val = "false";
			if(v[1].charAt(0)=='>' ) {
				if(a-b>0) {
					addTrue(index);
					continue;					
				}
			}
			

			if(v[1].charAt(0)=='<' ) {
				if(a-b<0) {
					addTrue(index);
					continue;					
				}
			}
			
			if(v[1].equals(">=")||v[1].equals("==")||v[1].equals("<=")) {
				if(a==b) {
					addTrue(index);
					continue;
				}
			}
			
			if(v[1].equals("!=")) {
				if(a!=b) {
					addTrue(index);
					continue;
				}
			}
			addFalse(index);
		}
		
		bw.write(ans.toString());

		br.close();
		bw.close();
	}
}