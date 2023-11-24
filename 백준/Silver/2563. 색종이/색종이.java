import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		TreeSet<Integer> set[] = new TreeSet[100];		
		try {
			int a = Integer.parseInt(br.readLine());
			for(int i=0;i<a;i++) {
				String temp = br.readLine();
				String temps[] = temp.split(" ");
				int b = Integer.parseInt(temps[0]);
				int c = Integer.parseInt(temps[1]);
				for(int j=c;j<c+10;j++) {
					for(int k=b;k<b+10;k++) {
						if(set[j]==null) {
							set[j]=new TreeSet<Integer>();
						}
						set[j].add(k);
					}
				}
			}
			int sum = 0;
			for(int i=0;i<100;i++) {
				if(set[i]!=null)
					sum+=set[i].size();
			}
			bw.write(""+sum);
			bw.flush();
			br.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}