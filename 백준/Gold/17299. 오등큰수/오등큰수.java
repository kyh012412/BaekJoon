
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int brr[] = new int[n];
		int crr[] = new int[n];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		
		for(int i=0;i<brr.length;i++) {
			brr[i] = map.get(arr[i]);
		}
		
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				s.add(i);
				continue;
			}
			
			if(!s.isEmpty() && brr[i]>brr[s.peek()]) {
				while(!s.isEmpty() && brr[i]>brr[s.peek()]) {
					int num = s.pop();
					crr[num]=arr[i];					
				}
				//여기서 디버깅
				s.add(i);
				continue;
			}else if(i!=arr.length-1){
				s.add(i);
				continue;
			}else {
				crr[i]=-1;
			}
		}
		while(s.size()!=0) {
			int num = s.pop();
			crr[num] =-1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<crr.length;i++) {
			sb.append(crr[i]+" ");
		}
		
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
}