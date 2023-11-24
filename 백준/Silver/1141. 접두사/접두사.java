
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

		HashSet<String> set = new HashSet<String>();
		ArrayList<String> list;
		
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0;i<cnt;i++) {
			set.add(br.readLine());
		}
		
		list = new ArrayList<String>(set);
		
		Collections.sort(list);
		ArrayList<String> list2 = new ArrayList<String>(list);
		for(int i=0;i<list2.size()-1;i++) {
			for(int j=i+1;j<list2.size();j++) {
				if(list2.get(j).startsWith(list2.get(i))) {
					list.remove(list2.get(i));
				}
			}
		}
		
		bw.write(""+list.size());

		br.close();
		bw.close();
	}
}