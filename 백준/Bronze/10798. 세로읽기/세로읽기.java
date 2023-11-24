import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			boolean isnotfinished[] = new boolean[5];
			Arrays.fill(isnotfinished, true);
			String str[] = new String[5];
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			//키 몇번째 스트링인지에 관한 인덱스, 값 해당인덱스의 마지막값

			for (int i = 0; i < str.length; i++) {
				str[i] = br.readLine();
				str[i] = str[i].trim();
				map.put(i, str[i].length()-1);
			}
			
			int idx=0; //0~4 5일경우 -5해서 다시 0으로
			int idx2=0;
			while(isnotfinished[0] || isnotfinished[1] || isnotfinished[2] 
					|| isnotfinished[3] || isnotfinished[4]) {
				if(isnotfinished[idx]) {
					bw.write(str[idx].charAt(idx2));
					if(map.get(idx)==idx2) {
						isnotfinished[idx]=false;
					}
				}
				idx++;
				if(idx>=5) {
					idx=0;
					idx2++;
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