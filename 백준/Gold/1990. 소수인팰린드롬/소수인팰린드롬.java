
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static boolean ispn(int a) {
		for(int i=2;(1.0)*i*i<=a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static boolean ispal(int a) {
		StringBuilder sb = new StringBuilder(""+a);
		if(sb.toString().equals(sb.reverse().toString())){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String v[] = br.readLine().split(" ");

		int a = Integer.parseInt(v[0]);
		int b = Integer.parseInt(v[1]);
		if(a%2==0) {
			a++;
		}
		for(int i=a;i<=b;i+=2) {
			if(ispal(i) && ispn(i)) {
				bw.write(""+i);
				bw.newLine();
			}
		}
		bw.write("-1");
		
		br.close();
		bw.close();
	}
}