
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			int num = Integer.parseInt(br.readLine());
			LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
			int insu=2;
			while(num!=1) {
				while(num%insu==0) {
					map.put(insu, map.getOrDefault(insu, 0)+1);
					num/=insu;
					insu=1;
					break;
				}
				insu++;
			}
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				bw.write(entry.getKey()+" "+entry.getValue());
				bw.newLine();
			}
		}
		
		bw.close();
		br.close();
	}
}