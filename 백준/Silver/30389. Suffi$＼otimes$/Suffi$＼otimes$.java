
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Boolean> map = new HashMap<String, Boolean>();
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<str.length();j++) {
				String part = str.substring(j);
				map.put(part, !map.getOrDefault(part, false));
			}
		}
		long count=0;
		for(Map.Entry<String, Boolean> entry : map.entrySet()) {
			if(entry.getValue())
				count++;
		}
		bw.write(""+count);
		
		br.close();
		bw.close();
		
	}
}