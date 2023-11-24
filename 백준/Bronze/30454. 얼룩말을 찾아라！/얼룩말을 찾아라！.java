
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	static int n;
	static int m;
	static int ans=0;
	static int max=-1;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String v[] = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		m = Integer.parseInt(v[1]);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			String str= br.readLine();
			boolean isone=false;
			int onecount=0;
			for(int j=0;j<str.length();j++) {
				if(j==0) {
					if(str.charAt(j)=='1') {
						isone=true;
						onecount++;
					}else {
						isone=false;
					}
					continue;
				}else{
					if(!isone && str.charAt(j)=='1') {
						onecount++;
						isone=true;
					}else {
						if(isone && str.charAt(j)=='0') {
							isone=false;
						}
					}
				}
				
			}
			map.put(onecount, map.getOrDefault(onecount, 0)+1);
			if(max<onecount) {
				max=onecount;
			}
		}
		
		
		bw.write(""+max+" "+map.get(max));
		bw.close();
		br.close();
	}
}