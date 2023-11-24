
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1)<Math.abs(o2)) {
					return -1;
				}else if(Math.abs(o1)>Math.abs(o2)) {
					return 1;
				}else {
					if(o1<o2) {
						return -1;
					}else if(o1>o2) {
						return 1;
					}else {
						return 0;
					}
				}
			}
		});
		try {
			int tc = Integer.parseInt(br.readLine());
			for(int i=0;i<tc;i++) {
				int key = Integer.parseInt(br.readLine());
				switch(key) {
				case 0:
					if(pq.isEmpty()) {
						bw.write("0");
						bw.newLine();
					}else {
						bw.write(""+pq.poll());
						bw.newLine();
					}
					break;
				default:
					pq.add(key);
				}
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
