import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		TreeMap<String, Integer> fmap = new TreeMap<String, Integer>();
		TreeMap<String, Integer> bmap = new TreeMap<String, Integer>();
		
		
		try {
			for(int i=0;i<3;i++) {
				String str = br.readLine();
				String vals[] = str.split(" ");
				for(int j=0;j<2;j++) {
					if(j==0) {
						fmap.put(vals[j], fmap.getOrDefault(vals[j], 0)+1);
					}else {
						bmap.put(vals[j], bmap.getOrDefault(vals[j], 0)+1);
					}
				}
			}
			
			for(Map.Entry<String, Integer> entry : fmap.entrySet()) {
				if(entry.getValue()==1) {
					bw.write(entry.getKey()+" ");
				}
			}
			for(Map.Entry<String, Integer> entry : bmap.entrySet()) {
				if(entry.getValue()==1) {
					bw.write(entry.getKey());
				}
			}
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}