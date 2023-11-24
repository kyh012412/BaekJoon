
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			long target = Long.parseLong(str);
			long answer=0;
			
			//1 2 4 7 만 안됨
			HashSet<Long> set = new HashSet<Long>();

			set.add((long) 1);
			set.add((long) 2);
			set.add((long) 4);
			set.add((long) 7);
			
			if(set.contains(target)) {
				bw.write("-1");
				bw.flush();
				br.close();
				return;
			}
			if(target>0) {
				answer += target/5;
				target %=5;
//				target-=5;
//				answer++;
			}
			target-=5;
			answer++;
			while(target%3!=0 || target<0) {
				target+=5;
				answer--;
			}
			if(target!=0) {
				answer+=target/3;
			}
			
			bw.write(""+answer);			

			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}