import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int sumCounted=0;
		int total=0;
		int max=-10000001;
		int indexe=-1; //더해진 숫자의 마지막 인덱스
		int indexs=-1;
		
		int arr[] = new int[n];
		
		String v[] = br.readLine().split(" ");
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(v[i]);
		}
		
		while(indexe<n-1) {			
			if(sumCounted<m) {
				total+=arr[++indexe];
				sumCounted++;
			}
			if(sumCounted==m) {
				if(max<total) {
					max=total;
				}
				total-=arr[++indexs];
				sumCounted--;
			}
		}
		
		bw.write(max+"");
		
		br.close();
		bw.close();
	}
}