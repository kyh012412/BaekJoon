import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<String> set = new HashSet<String>();
		
		try {
			String str = br.readLine();
			int num1 = Integer.parseInt(str);
			for(int i=0;i<num1;i++) {
				str = br.readLine();
				if(str.split(" ")[1].equals("enter")) {
					set.add(str.split(" ")[0]);
				}else {
					set.remove(str.split(" ")[0]);
				}
			}
			ArrayList<String> list = new ArrayList<String>(set);
			Collections.sort(list,Collections.reverseOrder());
			
			
//			
			for(String a : list) {
				bw.write(a);
				bw.newLine();
			}

			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}