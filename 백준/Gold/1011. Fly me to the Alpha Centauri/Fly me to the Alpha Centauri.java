
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int arr[] = new int[92682];
		int idx=1;
		int iidx=1;
		int total=0;
		map.put(0, 0);
		arr[0]=0;
		while(true) {
			total += idx;
//			System.out.println(total+" "+iidx);
			if(total<0) {
				arr[iidx++]=2147483647;
				break;
			}
			arr[iidx++]=total;
//			map.put(iidx++, total);
			total += idx;
			if(total<0) {
				arr[iidx++]=2147483647;
				break;
			}
//			System.out.println(total+" "+iidx);
			arr[iidx++]=total;
//			map.put(iidx++, total);
			idx++;
			if(total<0) {
				arr[iidx++]=2147483647;
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int tci=0;tci<tc;tci++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int len = b-a;
			idx=1;
			while(true) {
				if(arr[idx-1]<len &&
						len <= arr[idx]) {
					sb.append(idx+"\n");					
					break;
				}else if(idx<arr.length){
					idx++;
				}else {
					bw.write("-1");
					bw.close();
					return;
				}
			}
		}
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
}
