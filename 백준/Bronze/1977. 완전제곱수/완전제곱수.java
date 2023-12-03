
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[] = new int[101];
		for(int i=1;i<arr.length;i++) {
			arr[i] = i*i;
		}
		int a =Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int total=0;
		int min=0;
		
		for(int i=a;i<b+1;i++) {
			if(Arrays.binarySearch(arr, i)>=0) {
				if(min==0) {
					min=i;
				}
				total +=i;
			}
		}
		
		if(min==0 && total==0) {
			bw.write("-1");
		}else {
			bw.write(total+"\n"+min);
		}

		bw.close();
		br.close();
	}
}