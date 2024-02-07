import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 10;
				
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		int sum=0;
		
		for(int i=0;i<n;i++) {
			int num= Integer.parseInt(br.readLine());
			map.put(num, map.getOrDefault(num, 0)+1);
			sum+=num;
		}
		int val=0;//최빈값
		int count=0;//최빈값의 빈도수
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getValue());
			if(entry.getValue()>count) {
				count=entry.getValue();
				val = entry.getKey();
			}
		}
		
		bw.write(sum/10+"\n");
		bw.write(val+"");
		
		br.close();
		bw.close();
	}
}