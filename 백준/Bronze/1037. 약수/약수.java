import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer,Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			HashMap<Integer,Integer> map2 = new HashMap<>();
			int idx=2;
			while(num!=1) {
				if(num%idx==0) {
					num/=idx;
					map2.put(idx, map2.getOrDefault(idx, 0)+1);
					idx=2;
				}else {
					idx++;
				}
			}
			for(Map.Entry<Integer, Integer> entry : map2.entrySet()) {
				int key = entry.getKey();
				int value = entry.getValue();
				if(map.getOrDefault(key, 0)<value) {
					map.put(key, value);
				}else {
					continue;
				}
			}
		}
		
		int gop=1;
		
		if(map.size()==1) {
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				int key = entry.getKey();
				int value = entry.getValue();
				gop *= (int)Math.pow(key, value+1);
			}
		}else {
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				int key = entry.getKey();
				int value = entry.getValue();
				gop *= (int)Math.pow(key, value);
			}
		}
		
		bw.write(gop+"");
		
		br.close();
		bw.close();		
	}
}