
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int n, t; // n 갯수 //t 타겟숫자
	static int arr[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());

		arr = new int[n + 1];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int s,e;
		s=e=0;
		int sum=0;
		int count=0;
		int min=100001;
		while(!(s==n&&e==n)) {
			if(sum-t>=0) {
				if(count<min) {
					min=count;
				}
			}
			
			if(sum-t<0) {
				if(e<n) {
					sum+=arr[e++];
					count++;
				}else {
					break;
				}
			}else if(sum-t==0) {
				if(s<n) {
					sum-=arr[s++];
					count--;
				}
				if(e<n) {
					sum+=arr[e++];
					count++;
				}
			}else if(sum-t>0) {
				if(s<n) {
					sum-=arr[s++];
					count--;
				}else {
					
				}
			}
		}
		if(min!=100001) {
			bw.write(min+"");
		}else {
			bw.write("0");
		}
		

		bw.flush();
		br.close();
	}
}