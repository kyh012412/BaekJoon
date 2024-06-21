import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	
	public static boolean isInDaytime(int n) {
		if(n>=420 && n<1140) {
			return true;
		}
		return false;
	}
	
	/** 
	 * @param start 전화를 한 시작한 시간
	 * @param during 전화를 한 기간
	 * */
	public static int getPayment(int start,int during) {
		// 7:00 420
		// 19:00 1140
		int end = start+during;
		
		//10배요금제
		if(isInDaytime(start)) {
			if(isInDaytime(end)) {
				return during*10;
			}else {
				return (1140-start)*10 + (end-1140)*5;
			}
		}else {
			if(isInDaytime(end)) {
				return (420-start)*5 + (end-420)*10;
			}else {
				return during*5;
			}
		}
	}	
	
	public static int transType(String str) {
		String v[] = str.split(" ");
		int during = Integer.parseInt(v[1]);
		v = v[0].split(":");
		int start = Integer.parseInt(v[0])*60+Integer.parseInt(v[1]);
		int val =getPayment(start, during);
		return val;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			ans += transType(br.readLine());
		}
		
		bw.write(ans+"");

		br.close();
		bw.close();
	}
}