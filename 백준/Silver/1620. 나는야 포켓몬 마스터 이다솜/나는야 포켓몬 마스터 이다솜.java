
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String names[];
		
		String v[];
		v = br.readLine().split(" ");
		int a = Integer.parseInt(v[0]);
		int b = Integer.parseInt(v[1]);
		
		names = new String[a+1];
		for(int i=0;i<a+1;i++) {
			if(i==0) continue;
			String name = br.readLine();
			names[i]=name;
			map.put(name, i);
		}
		for(int i=0;i<b;i++) {
			String key = br.readLine();
			if(map.containsKey(key)) {
				bw.write(""+map.get(key));
				bw.newLine();
			}else {
				int keyint = Integer.parseInt(key);
				bw.write(names[keyint]);
				bw.newLine();
			}
		}
		
		bw.close();
		br.close();
	}
}