import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String v[] = br.readLine().split(" ");
		int a[] = new int[v.length];
		
		for(int i=0;i<a.length;i++) {
			a[i] = Integer.parseInt(v[i]);
		}
		Arrays.sort(a);
		
		bw.write("" + Math.abs((a[0]+a[3])-(a[1]+a[2])));
		
		
		bw.close();
		br.close();
		
	}
}
