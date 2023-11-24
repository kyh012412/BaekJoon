import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int checkchessboard(String[] strs, int x,int y) {
		int count=0;
		
		for(int j=y;j<y+8;j++) {
			for(int i=x;i<x+8;i++) {
				if((i+j)%2==0) {
					if(strs[j].charAt(i)=='B') {
						count++;
					}
				}else {
					if(strs[j].charAt(i)=='W') {
						count++;
					}
				}
			}
		}
		count = count <64-count ? count : 64-count;
		
		return count;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			String vals[] = str.split(" ");
			int y = Integer.parseInt(vals[0]);
			int x = Integer.parseInt(vals[1]);
			String strs[] = new String[y];
			int min=65;
			
			for(int j=0;j<y;j++) {
				strs[j]=br.readLine();				
			}
			
			outer:for(int j=0;j<y-7;j++) {
				for(int i=0;i<x-7;i++) {
					int val = checkchessboard(strs,i,j);
					if(val<min) {
						min=val;
						if(min==0) {
							break outer;
						}
					}
				}
			}
			
			bw.write(""+min);

			bw.flush();
			br.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
