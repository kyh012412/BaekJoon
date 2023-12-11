
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int n, k;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min =101;
		int total =0;
		int idx=-1;
		String strs[] = {"Soongsil","Korea","Hanyang"};
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			total+=arr[i];
			
			if(arr[i]<min) {
				min=arr[i];
				idx=i;
			}
		}
		if(total>=100) {
			bw.write("OK");
		}else {
			bw.write(strs[idx]);
		}
		
		br.close();
		bw.close();
	}
}
