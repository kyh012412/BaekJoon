import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int tc = Integer.parseInt(br.readLine());
			man mans[] = new man[tc];
			for(int i=0;i<tc;i++) {
				mans[i] = new man(br.readLine());
			}
			for(int i=0;i<tc-1;i++) {
				for(int j=i+1;j<tc;j++) {
					mans[i].cmp(mans[j]);
				}
			}
			for(int i=0;i<tc;i++) {
				bw.write(mans[i].toString());
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	public static class man{
		int w;
		int h;
		int r=1;
		
		public man(int w,int h) {
			this.w = w;
			this.h = h;
		}
		public man(String str) {
			w = Integer.parseInt(str.split(" ")[0]);
			h = Integer.parseInt(str.split(" ")[1]);
		}
		
		public void cmp(man o) {
			if(this.w > o.w && this.h > o.h) {
				o.r++;
			}else if(this.w < o.w && this.h < o.h) {
				this.r++;
			}
		}
		@Override
		public String toString() {
			
			return r+" ";
		}
	}
}