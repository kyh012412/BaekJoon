
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static boolean che[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max=10000000;
		che = new boolean[max+1];
		int i=2;
		while(true) {
			if(!che[i]) {
				int ii = i*i;
				if(ii>max || ii<2)break;
				while(true) {
					if(ii>max || ii<2)break;
					che[ii]=true;
					ii+=i;
				}
			}
			if(i*i>max || i*i<2)
				break;
			i++;
		}
		
				
		String v[];
		v= br.readLine().split(" ");
		long s= Long.parseLong(v[0]);
		long e= Long.parseLong(v[1]);
		long idx=2;
		long pows=2;
		int count=0;
		while(true) {
			if(Math.pow(idx, 2)>e) {
				break;
			}
			long val;
			while(true) {
				val = (long)Math.pow(idx, pows);
				if(val>=s && val<=e) {
					count++;
				}else if(val<s && val>0){
				}else {
					break;
				}
				pows++;
			}
			idx++;
			while(idx*idx<=e && che[(int)idx]) {
				idx++;
			}
			pows=2;
		}
		bw.write(""+count);

		bw.close();
		br.close();
	}
}