import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String str = br.readLine();
			String vals[] = str.split(" ");
			boolean asc = true;
			boolean desc = true;
			int a[] = new int[vals.length];
			int b[] = new int[vals.length - 1];
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(vals[i]);
			}
			for (int i = 0; i < b.length; i++) {
				b[i] = a[i + 1] - a[i];
				if(asc && b[i]!=1) {
					asc=false;
				}
				if(desc && b[i]!=-1) {
					desc = false;
				}
			}
			if(asc) {
				bw.write("ascending");
			}else if(desc) {
				bw.write("descending");				
			}else {
				bw.write("mixed");						
			}

			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
