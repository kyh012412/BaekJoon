
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static int n;
	static String str;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<Character, Boolean> map  = new HashMap<Character, Boolean>();
		
		String v[] = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		str = br.readLine();
		
		for(int i=0;i<str.length()/2;i++) {
			char a = str.charAt(i);
			char b = str.charAt(str.length()-1-i);

			map.put(a, !map.getOrDefault(a, false));
			map.put(b, !map.getOrDefault(b, false));
		}
		
		boolean isyes = true;
		for(Map.Entry<Character, Boolean> entry : map.entrySet()) {
			if(entry.getValue()) {
				isyes=false;
				break;
			}
		}
		
		if(isyes) {
			bw.write("Yes");
		}else {
			bw.write("No");
		}
		
		
		bw.write("");
		
		bw.close();
		br.close();
	}
}