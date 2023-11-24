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
			String str = br.readLine();
			int num1 = Integer.parseInt(str.split(" ")[0]);
			int num2 = Integer.parseInt(str.split(" ")[1]);
			String a[] = new String[num1];
			String b[] = new String[num2];
			
			for(int i=0;i<num1;i++) {
				a[i]=br.readLine();
			}
			for(int i=0;i<num2;i++) {
				b[i]=br.readLine();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int count=0;
			for(String c : b) {
				if(Arrays.binarySearch(a, c)>=0) {
					count++;
				}
			}

			bw.write(""+count);

			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}