import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> queue = new ArrayList<Integer>();
		
		//스택으로 활용
		//마지막번호에 붙고 마지막번호가 먼저나가구
		
		try {
			String str;
			str = br.readLine();
			int a = Integer.parseInt(str);
			
			str = br.readLine();
			String vals[] =str.split(" ");
			for(int i=0;i<vals.length;i++) {
				int newnum = Integer.parseInt(vals[i]);
				queue.add(newnum);
			}
			
			
			
			int count=1;
			while(queue.size()!=0) {
				int newnum = queue.get(0);
				queue.remove(0);
				if(newnum!=count) {
					if(!list.isEmpty()) {
						if(list.get(list.size()-1)!=count) {
							list.add(newnum);
						}else {
							count++;
							list.remove(list.size()-1);
						}
					}else {
						list.add(newnum);
					}
				}else {
					count++;
				}
				if(!list.isEmpty()) {
					while(list.get(list.size()-1)==count) {
						list.remove(list.size()-1);
						count++;
						if(list.isEmpty()) {
							break;
						}
					}
				}
				
			}
			while(true) {
				if(list.isEmpty()) {
					bw.write("Nice");
					bw.flush();
					br.close();
					return;
				}else if(list.get(list.size()-1)!=count) {
					bw.write("Sad");
					bw.flush();
					br.close();
					return;
				}else {
					list.remove(list.size()-1);
					count++;
				}
			}
			

//			bw.write("Nice");
//			bw.flush();
//			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}