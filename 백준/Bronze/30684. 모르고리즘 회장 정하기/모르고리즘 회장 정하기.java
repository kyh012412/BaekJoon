
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class Main {

	static int n;
	static TreeSet<String> set = new TreeSet<String>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			if(str.length()==3) {
				if(set.isEmpty()) {
					set.add(str);
				}else {
					if(str.compareTo(set.first())<0) {
						set.clear();
						set.add(str);
					}
				}
			}
		}
		bw.write(set.first());

		bw.close();
		br.close();
	}
}