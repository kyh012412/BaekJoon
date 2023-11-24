import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str;
			str = br.readLine();// 1
			int tc = Integer.parseInt(str);
			
			str= br.readLine();
			String vals[] = str.split(" ");
			Arrays.sort(vals);
			tc = Integer.parseInt(br.readLine());			
			String str2= br.readLine();
			String vals2[] = str2.split(" ");
			
			for(int i=0;i<tc;i++) {
				if(Arrays.binarySearch(vals, vals2[i])>=0) {
					bw.write("1 ");
				}else {
					bw.write("0 ");
				}
			}
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}