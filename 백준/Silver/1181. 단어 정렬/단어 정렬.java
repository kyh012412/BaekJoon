import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashSet<String> set = new HashSet<String>();
		ArrayList<String> list = new ArrayList<String>();

		try {
			String str;
			str = br.readLine();// 1
			int tc = Integer.parseInt(str);
			for (int i = 0; i < tc; i++) {
				set.add(br.readLine());
			}
			list = new ArrayList<String>(set);

			Collections.sort(list, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					if (o1.length() > o2.length()) {
						return 1;
					}else if(o1.length() < o2.length()) {
						return -1;
					}else {
						if(o1.compareTo(o2)>0) {
							return 1;
						}else if(o1.compareTo(o2)<0) {
							return -1;
						}else {
							return 0;
						}
					}
				}
			});
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