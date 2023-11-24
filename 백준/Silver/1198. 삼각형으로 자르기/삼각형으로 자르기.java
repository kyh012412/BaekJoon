
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	
	static double max = -1;
	static ArrayList<point> q;
	
	static class point{
		int x;
		int y;
		
		public point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public point(String str) {			
			this.x = Integer.parseInt(str.split(" ")[0]);
			this.y = Integer.parseInt(str.split(" ")[1]);
		}
	}
	
	static void qrotate() {
		point temp = q.remove(0);
		q.add(temp);
	}
	
	static void redate(point a,point b, point c) {
		double width = (0.5)*Math.abs(
				a.x*b.y+b.x*c.y+c.x*a.y 
			-   (a.y*b.x+b.y*c.x+c.y*a.x));
		if(width>max) {
			max= width;
		}				
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		q = new ArrayList<Main.point>();
		
		String v[] = br.readLine().split(" ");
		int N = Integer.parseInt(v[0]);
		
		for(int i=0;i<N;i++) {
			q.add(new point(br.readLine()));
		}
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					redate(q.get(i),q.get(j),q.get(k));
				}
			}
		}
		
		bw.write(""+max);

		br.close();
		bw.close();
	}
}