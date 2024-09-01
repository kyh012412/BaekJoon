import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int sortCount=0;
	
	public static int[] arr;

	public static int n;
	public static int k;
	public static int passCount=0;
	public static int front=-1;
	
	public static void sort() {
		int maxIndex=-1;
		int maxValue=-1;
		int lastIndex=n-passCount;
		
		if(lastIndex<=1) {passCount++;return;}
		
		for(int i=1;i<=lastIndex;i++) {
			if(arr[i]>maxValue) {
				maxIndex = i;
				maxValue=arr[i];
			}
		}
		passCount++;
		
		if(maxValue!=arr[lastIndex]) {
			sortCount++;
			int temp = arr[lastIndex];
			arr[lastIndex] = arr[maxIndex];
			arr[maxIndex] = temp;
			front=temp;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1]; // 0번째 인덱스는 사용하지 않을 예정
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<n+1;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		while(true) {
			sort();
			if(sortCount==k) {
				bw.write(front + " "+arr[n-passCount+1]);
				break;
			}else if(sortCount<k) {
				if(passCount<n) {
					continue;
				}else {
					bw.write("-1");
					break;
				}
			}
		}
		
		br.close();
		bw.close();
	}
}