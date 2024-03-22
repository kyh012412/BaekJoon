import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String v[] = br.readLine().split(" ");
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<n;i++) {
			set.add(Integer.parseInt(v[i]));
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		
		Collections.sort(list);
		
		for(int i : list) {
			bw.write(i+" ");
		}
		

		br.close();
		bw.close();
	}
}